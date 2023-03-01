package com.dddStore.dddstore.domain.delivery.values;
import com.dddStore.dddstore.generic.ValueObject;

public class VehicleData implements ValueObject<VehicleData.Props> {
    private VehicleType vehicleType;
    private LicencePlate licencePlate;

    public VehicleData(VehicleType vehicleType, LicencePlate licencePlate) {
        this.vehicleType = vehicleType;
        this.licencePlate = licencePlate;
    }

    @Override
    public VehicleData.Props value() {
        return new VehicleData.Props() {
            @Override
            public VehicleType vehicleType() {
                return vehicleType;
            }

            @Override
            public LicencePlate licencePlate() {
                return licencePlate;
            }
        };
    }

    public interface Props {
        VehicleType vehicleType();
        LicencePlate licencePlate();
    }


}
