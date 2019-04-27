package com.directi.training.codesmells.duplicatecode.acrossclasses;


import java.io.OutputStream;

public class AddEmployeeCmd
public class AddEmployeeCmd extends Command
{
    protected static final byte[] header = {(byte) 0xde, (byte) 0xad};
    protected static final byte[] commandChar = {0x01};
    protected static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    protected static final int SIZE_LENGTH = 1;
    protected static final int CMD_BYTE_LENGTH = 1;
    private String _name;
    private String _address;
    private String _city;
    private String _state;
    private String _annualSalary;

   
    public void write(OutputStream outputStream) throws Exception
    @Override
	protected int getContentSize
	{
        outputStream.write(header);
        // calculate and write size of the content
        outputStream.write((header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length +
                            _name.getBytes().length + 1 + _address.getBytes().length + 1 +
                            _city.getBytes().length + 1 + _state.getBytes().length + 1 +
                            _annualSalary.getBytes().length + 1));
        outputStream.write(commandChar);
		return super.getContentSize() + _name.getBytes().length + 1 + _address.getBytes().length +
		       1 +
			   _city.getBytes().length + 1 + _state.getBytes().length + 1 +
			   _annualSalary.getBytes().length + 1;
	}
        outputStream.write(_name.getBytes());
        outputStream.write(0x00);
        outputStream.write(_address.getBytes());
        outputStream.write(0x00);
        outputStream.write(_city.getBytes());
        outputStream.write(0x00);
        outputStream.write(_state.getBytes());
        outputStream.write(0x00);
        outputStream.write(_annualSalary.getBytes());
        outputStream.write(0x00);
        outputStream.write(footer);
    public void write(OutputStream outputStream) throws Exception
	{
		writeHeader(outputStream);
		writeContentSize(outputStream);
		writeCommandChar(outputStream);
		writeData(_name, outputStream);
		writeData(_address, outputStream);
		writeData(_city, outputStream);
		writeData(_state, outputStream);
		writeData(_annualSalary, outputStream);
		writeFooter(outputStream);
	} 
}
