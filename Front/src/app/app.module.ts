import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LineChartComponent } from './line-chart/line-chart.component';
import * as echarts from 'echarts';
import { NgxEchartsModule } from 'ngx-echarts';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { PieChartComponent } from './pie-chart/pie-chart.component';
import {HeaderComponent} from "./header/header.component";

@NgModule({
  declarations: [
    AppComponent,
    LineChartComponent,
    PieChartComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    NgxEchartsModule.forRoot({
      echarts
    }),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
