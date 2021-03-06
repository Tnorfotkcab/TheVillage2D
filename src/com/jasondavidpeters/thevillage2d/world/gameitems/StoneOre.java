package com.jasondavidpeters.thevillage2d.world.gameitems;

import com.jasondavidpeters.thevillage2d.assets.Sprite;
import com.jasondavidpeters.thevillage2d.world.entities.npc.Player;

public class StoneOre extends GameItem {
	
	public StoneOre(Player p) {
		super(p);
		sprite=Sprite.GROUND_STONE_ENTITY;
	}

	public StoneOre(double x, double y, Sprite sprite) {
		super(x,y,sprite);
	}
	public StoneOre(Sprite sprite) {
		super(sprite);
	}
}
