import {Component} from "@angular/core";
import {CalService} from "./cal.service";
import {JokeService} from "./joke.service";


@Component({
	template:`<div class='calculator'>
		<p>Joke of the day -- {{joke}}</p>
		<h1>{{title}}</h1>
		Enter Value : <input placeholder='Pls enter number' type='number' [(ngModel)]='valOne' /><br/>
		Enter Value : <input placeholder='Pls enter number' type='number' [(ngModel)]='valTwo' /><br/>
					  <input type='button' value='SUM' (click)='doSum();' /><br/>
					  <input type='button' value='DIFF' (click)='doDiff();' /><br/>
					  <hr/>
					  <h1 *ngIf='result'>Result is {{result}}</h1>
		</div>`,
	selector:'my-app',
	styles:[`

		.calculator {
			border:20px inset rgba(255,50,60,0.8);
			width:40%;
			box-shadow:20px 40px 40px red;
			text-align:center;
		}

		.calculator h1{
			background-color:red;
			color:white;
			width:90%;
			margin:auto;
			margin-top:10px;
			margin-bottom:10px;
			border-radius:20px;
		}

		.calculator input{
			background-color:rgba(255,0,0,0.6);
			color:white;
			text-align:center;
			height:30px;
			font-size:26px;
			width:80%;
			margin:auto;
			margin-top:10px;
			margin-bottom:10px;
			border-radius:20px;
		}

		.calculator input[type=button]{
			background-color:blue;
			height:40px;
		}


	`]

})
export class CalculatorComponent{
	
	title:string = "Simple Math Calculator";
	
	valOne:number = 20;
	valTwo:number = 5;
	result:number = 0;
	joke:string = '';

	private calService:CalService = null;
	private jokeService:JokeService = null;

	constructor(_calService:CalService,_jokeService:JokeService){
		this.calService = _calService;
		this.jokeService = _jokeService;
		this.joke = this.jokeService.nextJoke();
	}


	//event handlers
	doSum(){
		this.result = this.calService.add(this.valOne,this.valTwo);
		this.joke = this.jokeService.nextJoke();
	}

	//event handlers
	doDiff(){
		this.result = this.calService.subtract(this.valOne,this.valTwo);
		this.joke = this.jokeService.nextJoke();
	}

}

