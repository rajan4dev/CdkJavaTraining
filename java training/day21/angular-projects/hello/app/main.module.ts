import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {HelloComponent} from './hello.component';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';


@NgModule({
	imports:[BrowserModule],
	declarations:[HelloComponent],
	bootstrap:[HelloComponent]
})
class MainModule{
}

platformBrowserDynamic().bootstrapModule(MainModule);

