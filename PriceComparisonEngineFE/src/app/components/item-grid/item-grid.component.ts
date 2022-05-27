import { Component, OnInit } from '@angular/core';
import {Item} from "../../models/Item";

@Component({
  selector: 'app-item-grid',
  templateUrl: './item-grid.component.html',
  styleUrls: ['./item-grid.component.css']
})
export class ItemGridComponent implements OnInit {
  itemList:Item[] = [{name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
    price:"999.99$",
    image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"},
    {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
      price:"999.99$",
      image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"},
    {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
      price:"999.99$",
      image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"},
    {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
      price:"999.99$",
      image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"},
    {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
      price:"999.99$",
      image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"},
    {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
      price:"999.99$",
      image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"},
    {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
      price:"999.99$",
      image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"},
    {name:"Nešiojamas kompiuteris „Apple Macbook Pro“",
      price:"999.99$",
      image:"https://www.ideal.lt/media/catalog/product/cache/1/small_image/300x300/9df78eab33525d08d6e5fb8d27136e95/m/a/macbookprom1spg.jpg"}]
  constructor() { }

  ngOnInit(): void {
  }

}
