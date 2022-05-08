package com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose;

import java.util.ArrayList;
import java.util.List;

class GildedRoseDemo {

	public static void main(String[] args) {
		System.out.println("OMGHAI!");

		List<Item> items = List.of(
				new Item("+5 Dexterity Vest", 10, 20), //
				new Item("Aged Brie", 2, 0), //
				new Item("Elixir of the Mongoose", 5, 7), //
				new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
				new Item("Sulfuras, Hand of Ragnaros", -1, 80),
				new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				// this conjured item does not work properly yet
				new Item("Conjured Mana Cake", 3, 6));

		GildedRose app = new GildedRose(items);

		int days = 15;
		if (args.length > 0) {
			days = Integer.parseInt(args[0]) + 1;
		}

		for (int i = 0; i < days; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.printf("%-45s %-15s %-15s \n", "name", "sellIn", "quality");
			for (Item item : items) {
				System.out.printf("%-45s | %-15s | %-15s \n", item.getName(), item.getSellIn(), item.getQuality());
			}
			System.out.println();
			app.updateQuality();
		}
	}

}