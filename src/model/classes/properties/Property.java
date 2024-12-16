package model.classes.properties;

import model.utils.ValidationHelper;

import java.util.Optional;

public class Property {
    public final String _propertyName;

    private short _currentRentLevel;

    public short get_currentRentLevel() {
        return _currentRentLevel;
    }

    public void set_currentRentLevel(short _currentRentLevel) {
        ValidationHelper.assertInRange(_currentRentLevel, 0, 5, Optional.of("Property level out of bounds"));
        this._currentRentLevel = _currentRentLevel;
    }

    public final short _propertyPrice;
    public final short _defaultRentPrice;
    public final short _oneHouseRentPrice;
    public final short _twoHouseRentPrice;
    public final short _threeHouseRentPrice;
    public final short _fourHouseRentPrice;
    public final short _hotelRentPrice;
    public final PropertyColor propertyColor;

    public Property(String propertyName, short currentRentLevel, short propertyPrice, short defaultRentPrice, short oneHouseRentPrice, short twoHouseRentPrice, short threeHouseRentPrice, short fourHouseRentPrice, short hotelRentPrice, PropertyColor color) {
        this._propertyName = propertyName;
        set_currentRentLevel(currentRentLevel);
        this._propertyPrice = propertyPrice;
        this._defaultRentPrice = defaultRentPrice;
        this._oneHouseRentPrice = oneHouseRentPrice;
        this._twoHouseRentPrice = twoHouseRentPrice;
        this._threeHouseRentPrice = threeHouseRentPrice;
        this._fourHouseRentPrice = fourHouseRentPrice;
        this._hotelRentPrice = hotelRentPrice;
        this.propertyColor = color;
    }
}
