/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.example.services;
public class Gpio_status implements android.os.Parcelable
{

  public int HEAD;

  public int RADAR;

  public int EAR_RIGHT;

  public int EAR_LEFT;

  public int HAND_RIGHT;

  public int HAND_LEFT;

  public int VIBRATION;

  public int aux0;

  public int aux1;

  public int aux2;

  public int aux3;

  public int aux4;

  public int aux5;

  public int aux6;

  public int aux7;

  public int aux8;

  public int aux9;

  public int aux10;

  public int aux11;

  public int aux12;

  public int aux13;

  public int aux14;

  public int aux15;
  public static final Creator<Gpio_status> CREATOR = new Creator<Gpio_status>() {
    @Override
    public Gpio_status createFromParcel(android.os.Parcel _aidl_source) {
      Gpio_status _aidl_out = new Gpio_status();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public Gpio_status[] newArray(int _aidl_size) {
      return new Gpio_status[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(HEAD);
    _aidl_parcel.writeInt(RADAR);
    _aidl_parcel.writeInt(EAR_RIGHT);
    _aidl_parcel.writeInt(EAR_LEFT);
    _aidl_parcel.writeInt(HAND_RIGHT);
    _aidl_parcel.writeInt(HAND_LEFT);
    _aidl_parcel.writeInt(VIBRATION);
    _aidl_parcel.writeInt(aux0);
    _aidl_parcel.writeInt(aux1);
    _aidl_parcel.writeInt(aux2);
    _aidl_parcel.writeInt(aux3);
    _aidl_parcel.writeInt(aux4);
    _aidl_parcel.writeInt(aux5);
    _aidl_parcel.writeInt(aux6);
    _aidl_parcel.writeInt(aux7);
    _aidl_parcel.writeInt(aux8);
    _aidl_parcel.writeInt(aux9);
    _aidl_parcel.writeInt(aux10);
    _aidl_parcel.writeInt(aux11);
    _aidl_parcel.writeInt(aux12);
    _aidl_parcel.writeInt(aux13);
    _aidl_parcel.writeInt(aux14);
    _aidl_parcel.writeInt(aux15);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    if (_aidl_parcelable_size < 0) return;
    try {
      HEAD = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      RADAR = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      EAR_RIGHT = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      EAR_LEFT = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      HAND_RIGHT = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      HAND_LEFT = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      VIBRATION = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux0 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux1 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux2 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux3 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux4 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux5 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux6 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux7 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux8 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux9 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux10 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux11 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux12 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux13 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux14 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aux15 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
    } finally {
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override public int describeContents()
  {
    return 0;
  }
}
