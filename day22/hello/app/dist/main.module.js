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
const core_1 = require('@angular/core');
const platform_browser_1 = require('@angular/platform-browser');
const forms_1 = require('@angular/forms');
const platform_browser_dynamic_1 = require('@angular/platform-browser-dynamic');
const hello_component_1 = require('./hello.component');
const person_component_1 = require('./person.component');
const persondetail_component_1 = require('./persondetail.component');
const city_component_1 = require('./city.component');
const date_component_1 = require('./date.component');
const adder_component_1 = require('./adder.component');
let MainModule = class MainModule {
};
MainModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule, forms_1.FormsModule],
        declarations: [date_component_1.DateComponent, city_component_1.CityComponent, hello_component_1.HelloComponent, person_component_1.PersonComponent, persondetail_component_1.PersonDetailComponent, adder_component_1.AdderComponent],
        bootstrap: [date_component_1.DateComponent]
    }), 
    __metadata('design:paramtypes', [])
], MainModule);
platform_browser_dynamic_1.platformBrowserDynamic().bootstrapModule(MainModule);
//# sourceMappingURL=main.module.js.map