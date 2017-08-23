import { Routes,RouterModule } from '@angular/router';
import {AboutUsComponent} from "./aboutus.component";
import {ContactUsComponent} from "./contactus.component";
import {CricketComponent} from "./cricket.component";
import {HomeComponent} from "./home.component";
import {MovieComponent} from "./movie.component";
import {CustomerComponent} from "./customer.component";
import {CarComponent} from "./car.component";


let routes:Routes = [
    {path:'home',component:HomeComponent},
    {path:'addCar',component:CarComponent},
    {path:'customer',component:CustomerComponent},
    {path:'aboutus',component:AboutUsComponent},
    {path:'contactus',component:ContactUsComponent},
    {path:'cricket',component:CricketComponent},
    {path:'movie/:mid',component:MovieComponent},
    {path:'',redirectTo:'/home',pathMatch:'full'},
];

export const configuredRoutes = RouterModule.forRoot(routes);