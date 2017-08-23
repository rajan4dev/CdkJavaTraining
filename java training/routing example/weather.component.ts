import {Component} from "@angular/core";

@Component({
	selector:'weather',
    template:'<div><h1>{{title}}</h1><h2>{{summary}}</h2></div>'
})
export class WeatherComponent{

	title:string ="Weather Details";
    summary:string ="Weather is cool";

}
