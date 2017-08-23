import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { HttpModule } from '@angular/http';

import {configuredRoutes} from './routes.config';


import {CustomerComponent} from './customer.component';
import {AppComponent} from "./app.component";
import {CricketComponent} from "./cricket.component";
import {NewsComponent} from "./news.component";
import {WeatherComponent} from "./weather.component";
import {HomeComponent} from "./home.component";
import {MovieComponent} from "./movie.component";
import {PoliticianComponent} from "./politician.component";


@NgModule({
	imports:[BrowserModule,FormsModule,HttpModule,configuredRoutes],
	declarations:[PoliticianComponent,MovieComponent,CustomerComponent,AppComponent,HomeComponent,CricketComponent,NewsComponent,WeatherComponent],
   	bootstrap:[AppComponent]
})
export class AppModule{
}

