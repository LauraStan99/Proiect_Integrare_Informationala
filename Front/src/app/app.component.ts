import {Component, OnInit} from '@angular/core';
import {LineChartComponent} from "./line-chart/line-chart.component";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  loadedFeature = 'pie';
  onNavigate(feature: string){
    this.loadedFeature = feature;
  }
}

