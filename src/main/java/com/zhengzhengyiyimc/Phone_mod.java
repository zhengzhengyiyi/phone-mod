package com.zhengzhengyiyimc;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zhengzhengyiyimc.item.Phone;

public class Phone_mod implements ModInitializer {
	public static final String MOD_ID = "phone_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Phone PHONE_ITEM = new Phone(new Item.Settings().maxCount(1).maxCount(3));

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, Identifier.of("phone_mod", "phone"), PHONE_ITEM);
	}
}
