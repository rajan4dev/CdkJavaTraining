import {Component} from "@angular/core";
import {Person} from "./person";

@Component({
	template:`<div>
		<h2>Current Time: {{currentTime}}</h2>
		<input type='button' value='Change' (click)='changeDate();' />
		</div>`,
	
	selector:'my-app'
})
export class DateComponent{
	
	currentTime = new Date();

	changeDate(){
		this.currentTime = new Date();
	}


}

