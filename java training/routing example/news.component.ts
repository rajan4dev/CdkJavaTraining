import {Component} from "@angular/core";

@Component({
	selector:'news',
    template:'<div><h1>{{title}}</h1><h2>{{summary}}</h2></div>'
})
export class NewsComponent{

	title:string ="News Details";
    summary:string ="Sushant is coming to help you, be careful";

}
