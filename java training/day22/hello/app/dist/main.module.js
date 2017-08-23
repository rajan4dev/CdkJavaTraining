"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
//Angular modules
const core_1 = require("@angular/core");
const platform_browser_1 = require("@angular/platform-browser");
const forms_1 = require("@angular/forms");
const platform_browser_dynamic_1 = require("@angular/platform-browser-dynamic");
//Application specific components
const hello_component_1 = require("./hello.component");
const person_component_1 = require("./person.component");
const persondetail_component_1 = require("./persondetail.component");
const city_component_1 = require("./city.component");
const date_component_1 = require("./date.component");
const cal_component_1 = require("./cal.component");
const calculator_component_1 = require("./calculator.component");
//Application specific services
const cal_service_1 = require("./cal.service");
const joke_service_1 = require("./joke.service");
let MainModule = class MainModule {
};
MainModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule, forms_1.FormsModule],
        providers: [cal_service_1.CalService, joke_service_1.JokeService],
        declarations: [calculator_component_1.CalculatorComponent, cal_component_1.CalComponent, date_component_1.DateComponent, city_component_1.CityComponent, hello_component_1.HelloComponent, person_component_1.PersonComponent, persondetail_component_1.PersonDetailComponent],
        bootstrap: [calculator_component_1.CalculatorComponent]
    })
], MainModule);
platform_browser_dynamic_1.platformBrowserDynamic().bootstrapModule(MainModule);
//# sourceMappingURL=main.module.js.map