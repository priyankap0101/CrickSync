import { HistoryComponent } from './pages/history/history.component';
import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LiveComponent } from './pages/live/live.component';
import { PointTableComponent } from './pages/point-table/point-table.component';

export const routes: Routes = [
    {
        path:"",
        redirectTo:'/live',
        pathMatch:'full'
       
    },
    {
        path:"home",
        component:HomeComponent,
        title:"Home | CricketLive"

    },
    {
        path:"history",
        component:HistoryComponent,
        title:"Match History | CricketLive"
        
    },
    {
        path:"live",
        component:LiveComponent,
        title:"Live Matches | CricketLive"
    },
    {
        path:"point-table",
        component:PointTableComponent,
        title:"Point Table  | CricketLive"
    }
];
