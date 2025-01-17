package juuxel.adorn.platform

import juuxel.adorn.block.entity.DrawerBlockEntity
import juuxel.adorn.block.entity.KitchenCupboardBlockEntity
import juuxel.adorn.block.entity.TradingStationBlockEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.screen.ScreenHandler

interface MenuBridge {
    fun drawer(syncId: Int, playerInventory: PlayerInventory, blockEntity: DrawerBlockEntity): ScreenHandler
    fun kitchenCupboard(syncId: Int, playerInventory: PlayerInventory, blockEntity: KitchenCupboardBlockEntity): ScreenHandler
    fun tradingStation(syncId: Int, playerInventory: PlayerInventory, blockEntity: TradingStationBlockEntity, owner: Boolean): ScreenHandler?
}
