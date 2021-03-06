package de.captaingoldfish.scim.sdk.common.exceptions;

/**
 * author Pascal Knueppel <br>
 * created at: 28.09.2019 - 13:39 <br>
 * <br>
 * this exception is used if an attempt was made to read a json attribute that does have another type as the
 * expected one
 */
public class IncompatibleAttributeException extends ScimException
{


  public IncompatibleAttributeException(String message)
  {
    this(message, null, null, null);
  }

  public IncompatibleAttributeException(String message, Throwable cause)
  {
    this(message, cause, null, null);
  }

  public IncompatibleAttributeException(String message, Throwable cause, String scimType)
  {
    this(message, cause, null, scimType);
  }

  public IncompatibleAttributeException(String message, Throwable cause, Integer status)
  {
    this(message, cause, status, null);
  }

  public IncompatibleAttributeException(String message, Throwable cause, Integer status, String scimType)
  {
    super(message, cause, status, scimType);
  }
}
