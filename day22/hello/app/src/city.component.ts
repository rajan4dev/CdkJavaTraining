import {Component} from "@angular/core";

@Component({
	template:`<div>
			Enter City : <input type=text [(ngModel)]='city' />			
			<h1>I live in {{city}}</h1>
			<h1>I live in {{city}}</h1>
			<h1>I live in {{city}}</h1>
			<h1>I live in {{city}}</h1>
			<h1>I live in {{city}}</h1>
			<h1>I live in {{city}}</h1>
		</div>`,
	selector:'my-app'
})
export class CityComponent{
	city:string = "Delhi";
}

