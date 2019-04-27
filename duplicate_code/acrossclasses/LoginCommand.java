package com.directi.training.codesmells.duplicatecode.acrossclasses;


import java.io.OutputStream;

public class LoginCommand
{
    protected static final byte[] header = {(byte) 0xde, (byte) 0xad};
    protected static final byte[] commandChar = {0x01};
    protected static final byte[] footer = {(byte) 0xbe, (byte) 0xef};
    protected static final int SIZE_LENGTH = 1;
    protected static final int CMD_BYTE_LENGTH = 1;
    private String _username;
    private String _password;

    
    
        
        _password = password;
    }

    public void write(OutputStream outputStream) throws Exception
	@Override
	protected int getContentSize()
    {
        outputStream.write(header);
        // calculate and write content size
        outputStream.write((header.length + SIZE_LENGTH + CMD_BYTE_LENGTH + footer.length +
                            _username.getBytes().length + 1 + _password.getBytes().length + 1));
        outputStream.write(commandChar);
        outputStream.write(_username.getBytes());
        outputStream.write(0x00);
        outputStream.write(_password.getBytes());
        outputStream.write(0x00);

        outputStream.write(footer);
		return super.getContentSize() + _username.getBytes().length + 1 +
			   _password.getBytes().length + 1;
    }
	public void write(OutputStream outputStream) throws Exception
	{
		writeHeader(outputStream);
		writeContentSize(outputStream);
		writeCommandChar(outputStream);
		writeData(_username, outputStream);
		 writeData(_password, outputStream);
		 writeFooter(outputStream);
	}
}
