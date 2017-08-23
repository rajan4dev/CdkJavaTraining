"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
const core_1 = require("@angular/core");
let CalComponent = class CalComponent {
    constructor() {
        this.title = "Simple Math Calculator";
        this.valOne = 20;
        this.valTwo = 5;
        this.result = 0;
    }
    doSum() {
        this.result = this.valOne + this.valTwo;
    }
    doDiff() {
        this.result = this.valOne - this.valTwo;
    }
};
CalComponent = __decorate([
    core_1.Component({
        template: `<div class='calculator'>
		<h1>{{title}}</h1>
		Enter Value : <input placeholder='Pls enter number' type='number' [(ngModel)]='valOne' /><br/>
		Enter Value : <input placeholder='Pls enter number' type='number' [(ngModel)]='valTwo' /><br/>
					  <input type='button' value='SUM' (click)='doSum();' /><br/>
					  <input type='button' value='DIFF' (click)='doDiff();' /><br/>
					  <hr/>
					  <h1 *ngIf='result'>Result is {{result}}</h1>
		</div>`,
        selector: 'my-app',
        styles: [`

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
], CalComponent);
exports.CalComponent = CalComponent;
//# sourceMappingURL=cal.component.js.map