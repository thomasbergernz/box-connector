
package org.mule.modules.box.config;

import javax.annotation.Generated;
import org.mule.modules.box.processors.UploadNewVersionPathMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.5.0-cascade", date = "2014-02-19T08:18:38-06:00", comments = "Build UNNAMED.1791.ad9d188")
public class UploadNewVersionPathDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UploadNewVersionPathMessageProcessor.class.getName());
        builder.addConstructorArgValue("uploadNewVersionPath");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "path", "path");
        parseProperty(builder, element, "fileId", "fileId");
        parseProperty(builder, element, "filename", "filename");
        parseProperty(builder, element, "etag", "etag");
        parseProperty(builder, element, "contentModifiedAt", "contentModifiedAt");
        parseProperty(builder, element, "accessTokenId");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
