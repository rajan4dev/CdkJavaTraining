import { Routes,RouterModule } from '@angular/router';
import {NewsComponent} from "./news.component";
import {WeatherComponent} from "./weather.component";
import {CricketComponent} from "./cricket.component";
import {HomeComponent} from "./home.component";
import {MovieComponent} from "./movie.component";
import {CustomerComponent} from "./customer.component";
import {PoliticianComponent} from "./politician.component";

let routes:Routes = [
    {path:'home',component:HomeComponent},
    {path:'politician',component:PoliticianComponent},
    {path:'customer',component:CustomerComponent},
    {path:'news',component:NewsComponent},
    {path:'weather',component:WeatherComponent},
    {path:'cricket',component:CricketComponent},
    {path:'movie/:mid',component:MovieComponent},
    {path:'',redirectTo:'/home',pathMatch:'full'},
];

export const configuredRoutes = RouterModule.forRoot(routes);