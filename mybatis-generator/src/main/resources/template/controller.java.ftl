package ${rootPackage}.controller;

@Api("${domainName}Controller")
@RestController
@RequestMapping("${variableName}")
public class ${domainName}Controller {

    @Autowired private ${domainName}Service ${variableName}Service;

}