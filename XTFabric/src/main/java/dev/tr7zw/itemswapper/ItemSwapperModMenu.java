package dev.tr7zw.itemswapper;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class ItemSwapperModMenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return ItemSwapperMod.instance::createConfigScreen;
    }  
    
}
