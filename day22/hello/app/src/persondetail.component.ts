import {Component} from "@angular/core";
import {Person} from "./person";

@Component({
	template:`<div>
		<h1>{{title}}</h1>
		<img [width]='imageSize.w' [height]='imageSize.h' [src]='person.avatar' />
		<h2>Name: {{person.name}}</h2>
		<h2>Age: {{person.age}}</h2>
		<h2>Phone: {{person.phone}}</h2>
		<input type='button' value='Show' (click)='showDetail();' />
		<input type='button' value='Run' (click)='run(person.age);' />
		</div>`,
	
	selector:'my-app'
})
export class PersonDetailComponent{
	
	title:string = "Person Details";
	person:Person = null;
	imageSize = {w:200,h:200};

	constructor(){
		//this.person = new Person();
		this.person = new Person('Pintu',12,'9800000000','images/adv1.jpg');
		console.log("PersonDetailComponent initialized!!!!!!");
	}

	showDetail(){
		console.info("PersonDetailComponent showDetail clicked!!!!!!");
	}

	run(speed:number){
		console.info("Person "+this.person.name+" running "+speed+" miles per hour.");
	}

}

