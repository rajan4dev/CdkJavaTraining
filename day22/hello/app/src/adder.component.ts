import {Component} from "@angular/core";

@Component({
	
	
	template:`<div>
	Enter Value1 : <input type=number [(ngModel)]='val1' /><br/>
	Enter Value2 : <input type=number [(ngModel)]='val2' /><br/>
	SUM : <input type=text value={{sum}} /><br/>
	<button type=button (click)='doSum();'> DoSum</button>
			</div>`,
	selector:'my-app'
})
export class AdderComponent{
	
	title:string = "Adder";
	
	val1:number = 0;
	val2:number = 0;
    sum:number=0;
	constructor(){
		console.log("PersonComponent initialized!!!!!!");
	}
	doSum(){
    this.sum=this.val1+this.val2;
    }

}

