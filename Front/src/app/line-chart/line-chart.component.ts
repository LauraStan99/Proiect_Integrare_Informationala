import {Component, Input, OnInit} from '@angular/core';
import * as echarts from 'echarts/core';
import { GridComponent, GridComponentOption } from 'echarts/components';
import { BarChart, BarSeriesOption } from 'echarts/charts';
import { CanvasRenderer } from 'echarts/renderers';
import {HttpClient} from "@angular/common/http";
import {map} from "rxjs/operators";
import {AnalyticsModel} from "../utils/analyticsModel";

@Component({
  selector: 'app-line-chart',
  templateUrl: './line-chart.component.html',
  styleUrls: ['./line-chart.component.css']
})
export class LineChartComponent implements OnInit{
  hospitalOverallRating: number[] = [];
  averageTotalPayments: number[] = [];

  constructor(private http: HttpClient) {
    this.getData();
  }
  ngOnInit(): void {
    echarts.use([GridComponent, BarChart, CanvasRenderer]);

    type EChartsOption = echarts.ComposeOption<
      GridComponentOption | BarSeriesOption
    >;

    var chartDom = document.getElementById('main')!;
    var myChart = echarts.init(chartDom);
    var option: EChartsOption;

    option = {
      xAxis: {
        type: 'category',
        data: this.hospitalOverallRating
      },
      yAxis: {
        type: 'value'
      },
      series: [
        {
          data: this.averageTotalPayments,
          type: 'bar',
          showBackground: true,
          backgroundStyle: {
            color: 'rgba(180, 180, 180, 0.2)'
          }
        }
      ]
    };

    option && myChart.setOption(option);
  }

  private getData() {
    this.http
      .get<AnalyticsModel[]>('http://localhost:8093/analytics')
      .subscribe(data => {
        data.forEach(values =>{
          this.averageTotalPayments.push(values.averageTotalPayments);
          this.hospitalOverallRating.push(values.hospitalOverallRating);
        });
        this.ngOnInit();
      });
  }
}

