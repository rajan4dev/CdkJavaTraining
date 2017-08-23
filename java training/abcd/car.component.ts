import {Component} from "@angular/core";
import {Http,Headers,RequestOptions} from "@angular/http";

import {Customer} from "./customer";
import {Car} from "./car";

@Component({
	selector:'addCar',
    templateUrl:'../partials/car.component.html',
    //styleUrls:['../css/customer.component.css'],
})
export class CarComponent{

	title:string ="Add your Car";
	car:Car;
	successMessage:string;
    errorMessage:string;


    constructor(private http:Http) {
        this.car = new Car("BMW","petrol");
    }

    addCar() {
        console.log("Inside addCar()!!!!");
        let addUrl = "/rest/add/car";

        var requestHeaders = new Headers({'Content-Type': 'application/json'});
        var options = new RequestOptions({headers: requestHeaders});

        //this.car.logo = this.car.make + '-' + this.car.model + '.png';
        //this.http.post(addUrl,this.car,options).subscribe(res => this.successMessage = res.toString());
        this.http.post(addUrl, this.car, options).subscribe(
            res => {
                this.successMessage = res.toString();
                console.log(res.text());
                this.errorMessage=""
            },
            error => {
                this.errorMessage = <any>error;
                this.successMessage = ""
            });
    }
}
