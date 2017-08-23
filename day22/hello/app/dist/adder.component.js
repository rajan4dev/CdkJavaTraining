"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
const core_1 = require("@angular/core");
let AdderComponent = class AdderComponent {
    constructor() {
        this.title = "Adder";
        this.val1 = 0;
        this.val2 = 0;
        this.sum = 0;
        console.log("PersonComponent initialized!!!!!!");
    }
    doSum() {
        this.sum = this.val1 + this.val2;
    }
};
AdderComponent = __decorate([
    core_1.Component({
        template: `<div>
	Enter Value1 : <input type=number [(ngModel)]='val1' /><br/>
	Enter Value2 : <input type=number [(ngModel)]='val2' /><br/>
	SUM : <input type=text value={{sum}} /><br/>
	<button type=button (click)='doSum();'> DoSum</button>
			</div>`,
        selector: 'my-app'
    }), 
    __metadata('design:paramtypes', [])
], AdderComponent);
exports.AdderComponent = AdderComponent;
//# sourceMappingURL=adder.component.js.map