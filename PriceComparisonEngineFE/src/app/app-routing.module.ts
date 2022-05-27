import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ItemComponent} from "./components/item/item.component";
import {ItemGridComponent} from "./components/item-grid/item-grid.component";

const routes: Routes = [{path:'',component:ItemComponent}, {path:'grid',component:ItemGridComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
