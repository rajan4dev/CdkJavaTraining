//Angular modules
import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

//Application specific components
import {HelloComponent} from './hello.component';
import {PersonComponent} from './person.component';
import {PersonDetailComponent} from './persondetail.component';
import {CityComponent} from './city.component';
import {DateComponent} from './date.component';
import {CalComponent} from './cal.component';
import {CalculatorComponent} from './calculator.component';

//Application specific services
import {CalService} from "./cal.service";
import {JokeService} from "./joke.service";

@NgModule({
	imports:[BrowserModule,FormsModule],
	providers:[CalService,JokeService],
	declarations:[CalculatorComponent,CalComponent,DateComponent,CityComponent,HelloComponent,PersonComponent,PersonDetailComponent],
	bootstrap:[CalculatorComponent]
})
class MainModule{
}

platformBrowserDynamic().bootstrapModule(MainModule);

