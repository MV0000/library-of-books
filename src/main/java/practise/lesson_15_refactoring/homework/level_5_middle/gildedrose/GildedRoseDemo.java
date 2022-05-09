package practise.lesson_15_refactoring.homework.level_5_middle.gildedrose;

import com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.GildedRose;
import com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item;

import java.util.ArrayList;
import java.util.List;

class GildedRoseDemo {

	public static void main(String[] args) {
		System.out.println("OMGHAI!");

		List<com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item> items = List.of(
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("+5 Dexterity Vest", 10, 20), //
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Aged Brie", 2, 0), //
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Elixir of the Mongoose", 5, 7), //
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Sulfuras, Hand of Ragnaros", 0, 80), //
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Sulfuras, Hand of Ragnaros", -1, 80),
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
				// this conjured item does not work properly yet
				new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.Item("Conjured Mana Cake", 3, 6));

		com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.GildedRose app = new com.example.libraryofbooks.practise.lesson_15_refactoring.homework.level_5_middle.gildedrose.GildedRose(items);

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