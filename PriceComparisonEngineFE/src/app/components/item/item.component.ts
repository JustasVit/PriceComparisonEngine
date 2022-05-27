import { Component, OnInit } from '@angular/core';
import {Item} from "../../models/Item";

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  item:Item = {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
               price:"999.99$",
               image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"};

  constructor() { }

  ngOnInit(): void {
  }

}
