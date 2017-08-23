import {Component} from "@angular/core";

@Component({
	selector:'home',
    templateUrl:'../partials/home.component.html',
    styleUrls:['../css/home.component.css'],
})
export class HomeComponent{

	title:string ="Welcome to CAR-CARE";
    summary:string ="Log-In";
}
