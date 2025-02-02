package emu.grasscutter.data.binout.routes;

import emu.grasscutter.net.proto.RoutePointOuterClass;
import emu.grasscutter.utils.Position;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.val;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoutePoint {
    private Position pos;
    private int speedLevel; // optional
    private float waitTime; // optional
    private float targetVelocity; // optional
    private boolean hasReachEvent; // optional
    // rotRoundReachDir //optional Pos with optional values
    // rotRoundLeaveDir //optional Pos with optional values

    public RoutePointOuterClass.RoutePoint.Builder toProto() {
        val builder = RoutePointOuterClass.RoutePoint.newBuilder().setPosition(pos.toProto());
        if (waitTime != 0) {
            builder.setTime(waitTime);
        } else if (targetVelocity != 0) {
            builder.setVelocity(targetVelocity);
        }

        return builder;
    }
}
