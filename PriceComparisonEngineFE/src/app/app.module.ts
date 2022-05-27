import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ItemComponent } from './components/item/item.component';
import { ItemGridComponent } from './components/item-grid/item-grid.component';

@NgModule({
  declarations: [
    AppComponent,
    ItemComponent,
    ItemGridComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
