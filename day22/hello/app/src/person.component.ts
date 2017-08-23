import {Component} from "@angular/core";

@Component({
	/*template:'<div><h1>Name: Raj</h1><h1>Age: 20</h1><h1>Phone: 98101010101</h1></div>',*/
	
	template:'<div><h1>{{title}}</h1><h2>Name: {{name}}</h2><h2>Age: {{age}}</h2><h2>Phone: {{phone}}</h2></div>',
	selector:'my-app'
})
export class PersonComponent{
	
	title:string = "Person Details";
	name:string = "Pintu";
	age:number = 34;
	phone:string = "980100010";

	constructor(){
		console.log("PersonComponent initialized!!!!!!");
	}

}

