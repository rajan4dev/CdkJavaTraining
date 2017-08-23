import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import {HelloComponent} from './hello.component';
import {PersonComponent} from './person.component';
import {PersonDetailComponent} from './persondetail.component';
import {CityComponent} from './city.component';
import {DateComponent} from './date.component';
import {AdderComponent} from './adder.component';


@NgModule({
	imports:[BrowserModule,FormsModule],
	declarations:[DateComponent,CityComponent,HelloComponent,PersonComponent,PersonDetailComponent,AdderComponent],
	bootstrap:[DateComponent]
})
class MainModule{
}

platformBrowserDynamic().bootstrapModule(MainModule);

