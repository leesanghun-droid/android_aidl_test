/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.example.services;
public interface IMyAidlInterface extends android.os.IInterface
{
  /** Default implementation for IMyAidlInterface. */
  public static class Default implements IMyAidlInterface
  {
    @Override public Gpio_status gpio_read() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void set_gpio(Gpio_output gpio_output) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IMyAidlInterface
  {
    private static final String DESCRIPTOR = "com.example.client.IMyAidlInterface";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.services.IMyAidlInterface interface,
     * generating a proxy if needed.
     */
    public static IMyAidlInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IMyAidlInterface))) {
        return ((IMyAidlInterface)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_gpio_read:
        {
          data.enforceInterface(descriptor);
          Gpio_status _result = this.gpio_read();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_set_gpio:
        {
          data.enforceInterface(descriptor);
          Gpio_output _arg0;
          if ((0!=data.readInt())) {
            _arg0 = Gpio_output.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.set_gpio(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements IMyAidlInterface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public Gpio_status gpio_read() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        Gpio_status _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_gpio_read, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().gpio_read();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = Gpio_status.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void set_gpio(Gpio_output gpio_output) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((gpio_output!=null)) {
            _data.writeInt(1);
            gpio_output.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_set_gpio, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().set_gpio(gpio_output);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static IMyAidlInterface sDefaultImpl;
    }
    static final int TRANSACTION_gpio_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_set_gpio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(IMyAidlInterface impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static IMyAidlInterface getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public Gpio_status gpio_read() throws android.os.RemoteException;
  public void set_gpio(Gpio_output gpio_output) throws android.os.RemoteException;
}
