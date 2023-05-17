import {Component, OnInit} from '@angular/core';
import * as echarts from 'echarts/core';
import {
  TitleComponent,
  TitleComponentOption,
  TooltipComponent,
  TooltipComponentOption,
  LegendComponent,
  LegendComponentOption
} from 'echarts/components';
import { PieChart, PieSeriesOption } from 'echarts/charts';
import { LabelLayout } from 'echarts/features';
import { CanvasRenderer } from 'echarts/renderers';
import {AnalyticsModel} from "../utils/analyticsModel";
import {HttpClient} from "@angular/common/http";
import {HospitalsByRegionModel} from "../utils/HospitalsByRegionModel";

@Component({
  selector: 'app-pie-chart',
  templateUrl: './pie-chart.component.html',
  styleUrls: ['./pie-chart.component.css']
})
export class PieChartComponent implements OnInit{

  hospitalRegions: string[] = [];
  numberOfHospitals: number[] = [];

  pieValues: any[] = [];

  constructor(private http: HttpClient) {
    this.getData();
  }

  ngOnInit(): void {
    echarts.use([
      TitleComponent,
      TooltipComponent,
      LegendComponent,
      PieChart,
      CanvasRenderer,
      LabelLayout
    ]);

    type EChartsOption = echarts.ComposeOption<
      | TitleComponentOption
      | TooltipComponentOption
      | LegendComponentOption
      | PieSeriesOption
    >;

    var chartDom = document.getElementById('pie-chart')!;
    var myChart = echarts.init(chartDom);
    var option: { legend: { orient: string; left: string }; series: { data: ({ name: string; value: number } | { name: string; value: number } | { name: string; value: number } | { name: string; value: number } | { name: string; value: number })[]; name: string; emphasis: { itemStyle: { shadowOffsetX: number; shadowBlur: number; shadowColor: string } }; type: string; radius: string }[]; tooltip: { trigger: string }; title: { subtext: string; left: string; text: string } };

    option = {
      title: {
        text: 'Number of hospitals by region',
        subtext: '',
        left: 'center'
      },
      tooltip: {
        trigger: 'item'
      },
      legend: {
        orient: 'vertical',
        left: 'left'
      },
      series: [
        {
          name: 'Access From',
          type: 'pie',
          radius: '50%',
          data: this.pieValues,
          emphasis: {
            itemStyle: {
              shadowBlur: 10,
              shadowOffsetX: 0,
              shadowColor: 'rgba(0, 0, 0, 0.5)'
            }
          }
        }
      ]
    };

    option && myChart.setOption(option);
  }

  private getData() {
    this.http
      .get<HospitalsByRegionModel[]>('http://localhost:8093/analytics/region')
      .subscribe(data => {
        data.forEach(values =>{
          this.hospitalRegions.push(values.hospitalRegion);
          this.numberOfHospitals.push(values.numberOfHospitals);
          this.pieValues.push({value: values.numberOfHospitals, name: values.hospitalRegion});
        });
        this.ngOnInit();
      });
  }

}
