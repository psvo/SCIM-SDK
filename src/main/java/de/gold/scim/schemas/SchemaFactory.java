package de.gold.scim.schemas;

import java.io.InputStream;
import java.net.URI;

import com.fasterxml.jackson.databind.JsonNode;

import de.gold.scim.constants.ClassPathReferences;
import de.gold.scim.utils.JsonHelper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


/**
 * author Pascal Knueppel <br>
 * created at: 28.09.2019 - 17:01 <br>
 * <br>
 * this class can be used to read new resource schemas into the scim context
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SchemaFactory
{

  /**
   * this method will read the default schemata, validate them against the meta schema definition and will
   * eventually put them into the scim context
   */
  private static void registerDefaultSchemas()
  {
    JsonNode userResource = JsonHelper.loadJsonDocument(ClassPathReferences.USER_SCHEMA_JSON);
    SchemaValidator.getValidatedSchema(MetaSchema.getInstance().getSchemaDocument(), userResource);
  }

  public static void registerNewSchema(URI resourceType, URI resourceSchema)
  {

  }

  public static void registerNewSchema(InputStream resourceType, InputStream resourceSchema)
  {

  }

}