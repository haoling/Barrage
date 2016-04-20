package net.moosecraft.Barrage;


import org.bukkit.entity.*;
import org.bukkit.util.Vector;

// Referenced classes of package moosecraft:
//            ArrowEffect

public class ImpactArrowEffect
    implements ArrowEffect
{

    public ImpactArrowEffect()
    {
    }

    public void onEntityHitEvent(Arrow arrow, Entity target)
    {
        if(target instanceof LivingEntity)
        {
            Player shooter = (Player)arrow.getShooter();
            Vector v = shooter.getLocation().getDirection();
            v.setY(v.getY() + 10);
            v.setX(v.getX() * 12);
            v.setZ(v.getZ() * 12);
            target.setVelocity(v);
        }
    }

    public void onGroundHitEvent(Arrow arrow1)
    {
    }
}