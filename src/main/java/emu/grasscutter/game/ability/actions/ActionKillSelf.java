package emu.grasscutter.game.ability.actions;

import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import emu.grasscutter.game.ability.Ability;
import emu.grasscutter.game.ability.AbilityAction;
import emu.grasscutter.game.ability.AbilityActionHandler;

@AbilityAction(AbilityModifierAction.Type.KillSelf)
public final class ActionKillSelf extends AbilityActionHandler {
    @Override
    public boolean execute(Ability ability, AbilityModifierAction action) {
        var owner = ability.getOwner();
        owner.getScene().killEntity(owner);

        return false;
    }
}
