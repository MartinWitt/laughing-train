# struts-examples 
 
# Bad smells
I found 171 bad smells with 21 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RedundantFieldInitialization | 45 | false |
| NonSerializableFieldInSerializableClass | 39 | false |
| AssignmentToStaticFieldFromInstanceMethod | 13 | false |
| SizeReplaceableByIsEmpty | 10 | true |
| ReturnNull | 9 | false |
| UnusedAssignment | 6 | false |
| IgnoreResultOfCall | 5 | false |
| SynchronizeOnNonFinalField | 5 | false |
| UtilityClassWithoutPrivateConstructor | 3 | true |
| UnnecessaryFullyQualifiedName | 3 | false |
| UNUSED_IMPORT | 3 | false |
| CStyleArrayDeclaration | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| NestedSynchronizedStatement | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| EmptyMethod | 2 | false |
| StringBufferReplaceableByStringBuilder | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| UnnecessaryModifier | 1 | true |
| MismatchedJavadocCode | 1 | false |
| UnnecessaryReturn | 1 | true |
| MissortedModifiers | 1 | false |
| UnnecessaryBoxing | 1 | false |
| SystemOutErr | 1 | false |
| RedundantMethodOverride | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| EqualsAndHashcode | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| InstanceofCatchParameter | 1 | false |
| ConstantValue | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Person\[persons.size()\]'
in `crud/src/main/java/org/apache/struts/crud/dao/MemoryPersonDao.java`
#### Snippet
```java
    @Override
    public Person[] getAllPersons() {
        return persons.toArray(new Person[persons.size()]);
    }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `transient` is redundant for a 'static' field
in `shiro-basic/src/main/java/org/apache/struts2/shiro/example/action/LoginAction.java`
#### Snippet
```java

    private static final long serialVersionUID = 1L;
    private static final transient Logger log = LogManager.getLogger(LoginAction.class);

    private String username;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `Themes` has only 'static' members, and lacks a 'private' constructor
in `type-conversion/src/main/java/org/apache/struts/model/Themes.java`
#### Snippet
```java
import java.util.Map;

public class Themes {

    private static Map<String, ThemeDescriptor> themes;
```

### UtilityClassWithoutPrivateConstructor
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/Constants.java`
#### Snippet
```java
 * <p> Manifest constants for the MailReader application. </p>
 */
public final class Constants {

    // --- Tokens ----
```

### UtilityClassWithoutPrivateConstructor
Class `JettyPlutoLauncher` has only 'static' members, and lacks a 'private' constructor
in `portlet/src/test/java/JettyPlutoLauncher.java`
#### Snippet
```java
import org.mortbay.jetty.webapp.WebAppContext;

public class JettyPlutoLauncher {
	public static void main(String[] args) throws Exception {
        System.setProperty("org.apache.pluto.embedded.portletIds", "StrutsPortlet");
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `HelloWorldAction.helloCount` from instance context
in `form-processing/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java

    public void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }
    
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `helloCount` from instance context
in `form-processing/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
        }
        
        helloCount++;
        
        return SUCCESS;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `helloCount` from instance context
in `form-validation/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
		}
		
		helloCount++;
		
		return SUCCESS;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `HelloWorldAction.helloCount` from instance context
in `form-validation/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java

	public void setHelloCount(int helloCount) {
		HelloWorldAction.helloCount = helloCount;
	}
	
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `helloCount` from instance context
in `exception-handling/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
		}
		
		helloCount++;
		
		return SUCCESS;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `HelloWorldAction.helloCount` from instance context
in `exception-handling/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java

	public void setHelloCount(int helloCount) {
		HelloWorldAction.helloCount = helloCount;
	}
	
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `nextId` from instance context
in `rest-angular/src/main/java/org/apache/examples/struts/services/OrdersService.java`
#### Snippet
```java
    public void save(Order order) {
        if (order.getId() == null) {
            order.setId(String.valueOf(nextId++));
        }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `HelloWorldAction.helloCount` from instance context
in `debugging-struts/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java

	public void setHelloCount(int helloCount) {
		HelloWorldAction.helloCount = helloCount;
	}
	
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `helloCount` from instance context
in `debugging-struts/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
			messageStore.setMessage( messageStore.getMessage() + " " + userName);
		}
		helloCount++;
		
		return SUCCESS;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `helloCount` from instance context
in `using-tags/src/main/java/org/apache/struts/using_tags/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
        messageStore = new MessageStore() ;
        
        helloCount++;
        
        return SUCCESS;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `helloCount` from instance context
in `message-resource/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
		}
		
		helloCount++;
		
		return SUCCESS;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `HelloWorldAction.helloCount` from instance context
in `message-resource/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java

	public void setHelloCount(int helloCount) {
		HelloWorldAction.helloCount = helloCount;
	}
	
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `helloCount` from instance context
in `coding-actions/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
        }
        
        helloCount++;
        
        return SUCCESS;
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `buffer`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/ApplicationListener.java`
#### Snippet
```java
                new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(os, 1024);
        byte buffer[] = new byte[1024];
        while (true) {
            int n = bis.read(buffer);
```

### CStyleArrayDeclaration
C-style array declaration of local variable `results`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java

        synchronized (subscriptions) {
            Subscription results[] = new Subscription[subscriptions.size()];
            return ((Subscription[]) subscriptions.values().toArray(results));
        }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `people.keySet()` may be replaced with 'values()' iteration
in `wildcard-method-selection/src/main/java/org/apache/struts/tutorials/wildcardmethod/service/PersonService.java`
#### Snippet
```java
	
	static{
		for (Integer id : people.keySet() ) {
			personList.add( people.get(id));
		}
```

### KeySetIterationMayUseEntrySet
Iteration over `people.keySet()` may be replaced with 'values()' iteration
in `wildcard-method-selection/src/main/java/org/apache/struts/tutorials/wildcardmethod/service/PersonService.java`
#### Snippet
```java
		personList = new ArrayList<>();

		for (Integer id : people.keySet() ) {
 			personList.add( people.get(id));
 		}
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `themes-override/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private EditService editService = new EditServiceInMemory();
	
	private Person personBean;
	
	private String [] sports = {"football", "baseball", "basketball" };
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `form-processing/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
     * to display in the view.
     */
    private MessageStore messageStore;
    
    private static int helloCount = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `form-processing/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
public class Register extends ActionSupport {

    private Person personBean;
    private List<Integer> options;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'user' in a Serializable class
in `json-customize/src/main/java/org/demo/ProduceAction.java`
#### Snippet
```java
public class ProduceAction extends ActionSupport {

    private User user;

    public String execute() throws Exception {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'bean' in a Serializable class
in `json/src/main/java/org/demo/ProduceAction.java`
#### Snippet
```java
public class ProduceAction extends ActionSupport {

    private MyBean bean;

    public String execute() throws Exception {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `form-validation/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;
	
	private Person personBean;

	
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `form-validation/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	 * to display in the view.
	 */
	private MessageStore messageStore;
	
	private static int helloCount = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'bean' in a Serializable class
in `json/src/main/java/org/demo/ConsumeAction.java`
#### Snippet
```java
public class ConsumeAction extends ActionSupport implements ServletRequestAware {

    private MyBean bean = new MyBean();
    private boolean responseAsJson = true;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'name' in a Serializable class
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExampleModelDriven.java`
#### Snippet
```java
public class FormExampleModelDriven extends ActionSupport implements ModelDriven<Name> {
    
	private Name name = new Name();

	public Name getModel() {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `spring-struts/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private EditService editService ;
	
	private Person personBean;
	
	private String [] sports = {"football", "baseball", "basketball" };
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `control-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private EditService editService = new EditServiceInMemory();

	private Person personBean;
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'thingManager' in a Serializable class
in `portlet/src/main/java/org/apache/struts2/portlet/example/spring/SpringAction.java`
#### Snippet
```java
public class SpringAction extends ActionSupport {

    private ThingManager thingManager = null;
    private String thing = null;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `exception-handling/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;

	private Person personBean;

	@Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `exception-handling/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	 * to display in the view.
	 */
	private MessageStore messageStore;
	
	private static int helloCount = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `themes/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private EditService editService = new EditServiceInMemory();
	
	private Person personBean;
	
	private String [] sports = {"football", "baseball", "basketball" };
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `debugging-struts/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;

	private Person personBean;

	@Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'ordersService' in a Serializable class
in `rest-angular/src/main/java/org/apache/examples/struts/actions/data/OrderController.java`
#### Snippet
```java
    private String id;
    private Collection<Order> list = null;
    private OrdersService ordersService = new OrdersService();

    // GET /data/order/1
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'model' in a Serializable class
in `rest-angular/src/main/java/org/apache/examples/struts/actions/data/OrderController.java`
#### Snippet
```java
    private static final Logger log = LogManager.getLogger(OrderController.class);

    private Order model = new Order();
    private String id;
    private Collection<Order> list = null;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `debugging-struts/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	 * to display in the view.
	 */
	private MessageStore messageStore;
	
	private static int helloCount = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `http-session/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	 * to display in the view.
	 */
	private MessageStore messageStore;
	
	private Map<String, Object> userSession ;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `bean-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java

	@Valid
	private Person personBean;
	private String[] sports = {"football", "baseball", "basketball"};
	private String[] genders = {"male", "female", "not sure"};
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `helloworld/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
     * to display in the view.
     */
    private MessageStore messageStore;

    /*
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `form-xml-validation/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private EditService editService = new EditServiceInMemory();

    private Person personBean;

    private String[] sports = {"football", "baseball", "basketball"};
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `interceptors/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;
	
	private Person personBean;

	
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'person' in a Serializable class
in `wildcard-method-selection/src/main/java/org/apache/struts/tutorials/wildcardmethod/action/PersonAction.java`
#### Snippet
```java
    private static final long serialVersionUID = 1L;

    Person person;
    int id;
    List<Person> personList = PersonService.getPersons();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personService' in a Serializable class
in `wildcard-method-selection/src/main/java/org/apache/struts/tutorials/wildcardmethod/action/PersonAction.java`
#### Snippet
```java
    int id;
    List<Person> personList = PersonService.getPersons();
    PersonService personService = new PersonService();

    public String execute() throws Exception {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `exclude-parameters/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
	private CarModelsService carModelsService = new CarModelsServiceHardCoded() ;
	
	private Person personBean;
	private String [] sports = {"football", "baseball", "basketball" };
	private String [] genders = {"male", "female", "not sure" };
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `using-tags/src/main/java/org/apache/struts/using_tags/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
     * to display in the view.
     */
    private MessageStore messageStore;
    
    private static int helloCount = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'selectedTheme' in a Serializable class
in `type-conversion/src/main/java/org/apache/struts/example/ThemeAction.java`
#### Snippet
```java

    private Map<String, ThemeDescriptor> themes = Themes.list();
    private ThemeDescriptor selectedTheme = Themes.get("simple");

    public String execute() throws Exception {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `annotations/src/main/java/example/actions/RegisterAction.java`
#### Snippet
```java
    private static final Logger log = LogManager.getLogger(RegisterAction.class);

    private Person personBean;

    @Action("register-input")
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `unit-testing/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;
	
	private Person personBean;

	
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `message-resource/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	private static final long serialVersionUID = 1L;
	
	private Person personBean;

	
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `message-resource/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	 * to display in the view.
	 */
	private MessageStore messageStore;
	
	private static int helloCount = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `preparable-interface/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private CarModelsService carModelsService = new CarModelsServiceHardCoded();

    private Person personBean;
    private String[] sports = {"football", "baseball", "basketball"};
    private String[] genders = {"male", "female", "not sure"};
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'personBean' in a Serializable class
in `form-tags/src/main/java/org/apache/struts/edit/action/EditAction.java`
#### Snippet
```java
    private final EditService editService = new EditServiceInMemory();

    private Person personBean;

    private final String[] sports = {"football", "baseball", "basketball"};
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'messageStore' in a Serializable class
in `coding-actions/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
     * to display in the view.
     */
    private MessageStore messageStore;
    
    private static int helloCount = 0;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'person' in a Serializable class
in `crud/src/main/java/org/apache/struts/crud/action/PersonAction.java`
#### Snippet
```java
    private static final Logger LOG = LogManager.getLogger(PersonAction.class.getName());
    private PersonService personService = new DefaultPersonService();
    private Person person;
    private Person[] persons;
    private String[] sports;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'persons' in a Serializable class
in `crud/src/main/java/org/apache/struts/crud/action/PersonAction.java`
#### Snippet
```java
    private PersonService personService = new DefaultPersonService();
    private Person person;
    private Person[] persons;
    private String[] sports;
    private String[] genders;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'countries' in a Serializable class
in `crud/src/main/java/org/apache/struts/crud/action/PersonAction.java`
#### Snippet
```java
    private String[] sports;
    private String[] genders;
    private Country[] countries;
    private String[] carModelsAvailable;

```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is map
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/SubscriptionAction.java`
#### Snippet
```java
     * <p>Provide the list of MailServer types.</p>
     *
     * @return List of MailServer types
     */
    public Map<String, String> getTypes() {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`personBean.getFirstName().length() == 0` can be replaced with 'personBean.getFirstName().isEmpty()'
in `form-validation/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	public void validate(){
		
		if ( personBean.getFirstName().length() == 0 ){	

			addFieldError( "personBean.firstName", "First name is required." );
```

### SizeReplaceableByIsEmpty
`personBean.getEmail().length() == 0` can be replaced with 'personBean.getEmail().isEmpty()'
in `form-validation/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
		
				
		if ( personBean.getEmail().length() == 0 ){	

			addFieldError( "personBean.email", "Email is required." );
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `validation-messages/src/main/java/org/apache/struts/validation_messages/Login.java`
#### Snippet
```java

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }

```

### SizeReplaceableByIsEmpty
`personBean.getFirstName().length() == 0` can be replaced with 'personBean.getFirstName().isEmpty()'
in `interceptors/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	public void validate(){
		
		if ( personBean.getFirstName().length() == 0 ){	

			addFieldError( "personBean.firstName", "First name is required." );
```

### SizeReplaceableByIsEmpty
`personBean.getEmail().length() == 0` can be replaced with 'personBean.getEmail().isEmpty()'
in `interceptors/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
		
				
		if ( personBean.getEmail().length() == 0 ){	

			addFieldError( "personBean.email", "Email is required." );
```

### SizeReplaceableByIsEmpty
`personBean.getFirstName().length() == 0` can be replaced with 'personBean.getFirstName().isEmpty()'
in `unit-testing/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	public void validate(){
		
		if ( personBean.getFirstName() == null || personBean.getFirstName().length() == 0 ){	

			addFieldError( "personBean.firstName", "First name is required." );
```

### SizeReplaceableByIsEmpty
`personBean.getEmail().length() == 0` can be replaced with 'personBean.getEmail().isEmpty()'
in `unit-testing/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
		
				
		if ( personBean.getEmail() == null || personBean.getEmail().length() == 0 ){	

			addFieldError( "personBean.email", "Email is required." );
```

### SizeReplaceableByIsEmpty
`personBean.getFirstName().length() == 0` can be replaced with 'personBean.getFirstName().isEmpty()'
in `message-resource/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	public void validate(){
		
		if ( personBean.getFirstName().length() == 0 ){	

			addFieldError( "personBean.firstName", "First name is required." );
```

### SizeReplaceableByIsEmpty
`personBean.getEmail().length() == 0` can be replaced with 'personBean.getEmail().isEmpty()'
in `message-resource/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
		
				
		if ( personBean.getEmail().length() == 0 ){	

			addFieldError( "personBean.email", "Email is required." );
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `tiles/src/main/java/org/demo/example/Login.java`
#### Snippet
```java

    private boolean isInvalid(String value) {
        return (value == null || value.length() == 0);
    }

```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `json-customize/src/main/java/org/demo/ExcludeTransformer.java`
#### Snippet
```java
public class ExcludeTransformer extends AbstractTransformer {
    public void transform(Object o) {
        return;
    }
}
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `exception-handling/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java

		throw new NullPointerException("Null Pointer Exception thrown from "
				+ Register.class.toString());
	}

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `debugging-struts/src/main/java/org/apache/struts/register/action/Register.java`
#### Snippet
```java
	public void throwNullPointerException() throws NullPointerException {
		throw new NullPointerException("Null Pointer Exception thrown from "
				+ Register.class.toString());
	}

```

## RuleId[id=NestedSynchronizedStatement]
### NestedSynchronizedStatement
Nested `synchronized` statement
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
            Subscription subscription =
                    new AbstractSubscription(this, host);
            synchronized (subscriptions) {
                subscriptions.put(host, subscription);
            }
```

### NestedSynchronizedStatement
Nested `synchronized` statement
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
            }
            MemoryUser user = new MemoryUser(this, username);
            synchronized (users) {
                users.put(username, user);
            }
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `crud/src/main/java/org/apache/struts/crud/dao/MemoryPersonDao.java`
#### Snippet
```java
    private static final Logger LOG = LogManager.getLogger(MemoryPersonDao.class.getName());

    private final static List<Person> persons;

    static {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
            if (writer.checkError()) {
                writer.close();
                fileNew.delete();
                throw new IOException("Saving database to '" + pathname + "'");
            }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
                writer.close();
            }
            fileNew.delete();
            throw e;
        }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
        File fileOld = new File(pathnameOld);
        if (fileOrig.exists()) {
            fileOld.delete();
            if (!fileOrig.renameTo(fileOld)) {
                throw new IOException
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
        if (!fileNew.renameTo(fileOrig)) {
            if (fileOld.exists()) {
                fileOld.renameTo(fileOrig);
            }
            throw new IOException
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
                    ("Renaming '" + pathnameNew + "' to '" + pathname + "'");
        }
        fileOld.delete();
    }

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `form-xml-validation/src/main/java/org/apache/struts/edit/service/EditServiceInMemory.java`
#### Snippet
```java
        person.setCarModels(carModels);
        person.setPhoneNumber("123-456-9999");
        person.setAge(new Integer(30));

    }
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
    public Subscription[] getSubscriptions() {

        synchronized (subscriptions) {
            Subscription results[] = new Subscription[subscriptions.size()];
            return ((Subscription[]) subscriptions.values().toArray(results));
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
                    ("Subscription not associated with this user");
        }
        synchronized (subscriptions) {
            subscriptions.remove(subscription.getHost());
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
    public Subscription findSubscription(String host) {

        synchronized (subscriptions) {
            return ((Subscription) subscriptions.get(host));
        }
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
    public Subscription createSubscription(String host) {

        synchronized (subscriptions) {
            if (subscriptions.get(host) != null) {
                throw new IllegalArgumentException("Duplicate host '" + host
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `subscriptions`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
            Subscription subscription =
                    new AbstractSubscription(this, host);
            synchronized (subscriptions) {
                subscriptions.put(host, subscription);
            }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `text-provider/src/main/java/org/apache/struts_example/MyLocalizedTextProvider.java`
#### Snippet
```java
            }
            URL url = file.toURI().toURL();
            System.out.println(url);
            urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls, this.getCurrentThreadContextClassLoader());
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `getTexts()` only delegates to its super method
in `text-provider/src/main/java/org/apache/struts_example/MyTextTextProvider.java`
#### Snippet
```java

    @Override
    public ResourceBundle getTexts() {
        return super.getTexts();
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'o != null' covered by subsequent condition 'o instanceof Country'
in `crud/src/main/java/org/apache/struts/crud/model/Country.java`
#### Snippet
```java
    @Override
    public boolean equals(Object o) {
        return (o!=null) 
                && (o instanceof Country) 
                && (((Country) o).getCountryId() != null) 
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.struts2.shiro.example.action` is unnecessary, and can be replaced with an import
in `shiro-basic/src/main/java/org/apache/struts2/shiro/example/interceptor/ShiroUserInterceptor.java`
#### Snippet
```java
    public String intercept(ActionInvocation actionInvocation) throws Exception 
    {
        if (actionInvocation.getAction() instanceof org.apache.struts2.shiro.example.action.ShiroBaseAction)
        {
            Subject shiroUser = SecurityUtils.getSubject();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * </p>
     *
     * @throws java.lang.Exception on database error
     */
    public void saveUser() throws Exception {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `jfreechart/src/main/java/org/apache/struts/example/Chart.java`
#### Snippet
```java
        );

        chart.setBackgroundPaint(java.awt.Color.white);

        return SUCCESS;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.opensymphony.xwork2.ActionSupport;`
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExample.java`
#### Snippet
```java
import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.opensymphony.xwork2.ActionSupport;

/**
```

### UNUSED_IMPORT
Unused import `import com.opensymphony.xwork2.config.Configuration;`
in `text-provider/src/main/java/org/apache/struts_example/IndexAction.java`
#### Snippet
```java
import com.opensymphony.xwork2.TextProvider;
import com.opensymphony.xwork2.TextProviderFactory;
import com.opensymphony.xwork2.config.Configuration;

public class IndexAction extends ActionSupport {
```

### UNUSED_IMPORT
Unused import `import com.opensymphony.xwork2.ActionSupport;`
in `validation-messages/src/main/java/org/apache/struts/validation_messages/Login.java`
#### Snippet
```java
package org.apache.struts.validation_messages;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ExampleSupport {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractUser()` of an abstract class should not be declared 'public'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * @param username The username of this user
     */
    public AbstractUser(UserDatabase database, String username) {

        super();
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `username` is accessed in both synchronized and unsynchronized contexts
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The username for this user.
     */
    private String username = null;


```

### FieldAccessedSynchronizedAndUnsynchronized
Field `log` is accessed in both synchronized and unsynchronized contexts
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
     * Logging output for this user database instance.
     */
    private Log log = LogFactory.getLog(this.getClass());

    /**
```

## RuleId[id=EmptyMethod]
### EmptyMethod
Method only calls its super
in `json-customize/src/main/java/org/demo/ExcludeTransformer.java`
#### Snippet
```java

public class ExcludeTransformer extends AbstractTransformer {
    public void transform(Object o) {
        return;
    }
```

### EmptyMethod
Method only calls its super
in `text-provider/src/main/java/org/apache/struts_example/MyTextTextProvider.java`
#### Snippet
```java

    @Override
    public ResourceBundle getTexts() {
        return super.getTexts();
    }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `form-processing/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
    private MessageStore messageStore;
    
    private static int helloCount = 0;
    
    public int getHelloCount() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `form-validation/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	private MessageStore messageStore;
	
	private static int helloCount = 0;
	
	public int getHelloCount() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExampleWithValidation.java`
#### Snippet
```java
 */
public class FormExampleWithValidation extends ActionSupport {
    private String firstName = null;
    private String lastName = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExampleWithValidation.java`
#### Snippet
```java
public class FormExampleWithValidation extends ActionSupport {
    private String firstName = null;
    private String lastName = null;

    public String input() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormTestAction.java`
#### Snippet
```java
public class FormTestAction extends ActionSupport {

    private String name = null;
    public String getName() {
        return name;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/SavePrefsAction.java`
#### Snippet
```java
 */
public class SavePrefsAction extends ActionSupport {
    private String preferenceOne = null;
    private String preferenceTwo = null;
    public String getPreferenceOne() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/SavePrefsAction.java`
#### Snippet
```java
public class SavePrefsAction extends ActionSupport {
    private String preferenceOne = null;
    private String preferenceTwo = null;
    public String getPreferenceOne() {
        return preferenceOne;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExample.java`
#### Snippet
```java

    String firstName = null;
    String lastName = null;

    public String getFirstName() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormExample.java`
#### Snippet
```java
public class FormExample extends DefaultActionSupport {

    String firstName = null;
    String lastName = null;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/FormResultAction.java`
#### Snippet
```java
public class FormResultAction extends ActionSupport {

    private String result = null;

    public String getResult() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/spring/SpringAction.java`
#### Snippet
```java

    private ThingManager thingManager = null;
    private String thing = null;

    public void setThingManager(ThingManager thingManager) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `portlet/src/main/java/org/apache/struts2/portlet/example/spring/SpringAction.java`
#### Snippet
```java
public class SpringAction extends ActionSupport {

    private ThingManager thingManager = null;
    private String thing = null;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `exception-handling/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	private MessageStore messageStore;
	
	private static int helloCount = 0;
	
	public int getHelloCount() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `rest-angular/src/main/java/org/apache/examples/struts/actions/IndexController.java`
#### Snippet
```java
    private static final long serialVersionUID = 6153177836211979662L;

    private boolean useMinifiedResources = false;

    public HttpHeaders index() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `rest-angular/src/main/java/org/apache/examples/struts/actions/data/OrderController.java`
#### Snippet
```java
    private Order model = new Order();
    private String id;
    private Collection<Order> list = null;
    private OrdersService ordersService = new OrdersService();

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `debugging-struts/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	private MessageStore messageStore;
	
	private static int helloCount = 0;
	
	public int getHelloCount() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/SubscriptionAction.java`
#### Snippet
```java
     * <p>Field to store list of MailServer types</p>
     */
    private Map<String, String> types = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/ApplicationListener.java`
#### Snippet
```java
     * <p>The <code>ServletContext</code> for this web application.</p>
     */
    private ServletContext context = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/ApplicationListener.java`
#### Snippet
```java
     * The {@link MemoryUserDatabase} object we construct and make available.
     */
    private MemoryUserDatabase database = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * Should we auto-connect at startup time?
     */
    private boolean autoConnect = false;

    public boolean getAutoConnect() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The mail host for this subscription.
     */
    private String host = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The username for this subscription.
     */
    private String username = null;

    public String getUsername() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The password (in clear text) for this subscription.
     */
    private String password = null;

    public String getPassword() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The {@link User} with which we are associated.
     */
    private User user = null;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `using-tags/src/main/java/org/apache/struts/using_tags/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
    private MessageStore messageStore;
    
    private static int helloCount = 0;
    
    public int getHelloCount() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The EMAIL address to which replies should be sent.
     */
    private String replyToAddress = null;

    public String getReplyToAddress() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The email address from which messages are sent.
     */
    private String fromAddress = null;

    public String getFromAddress() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The {@link UserDatabase} with which we are associated.
     */
    private UserDatabase database = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The full name of this user, included in from addresses.
     */
    private String fullName = null;

    public String getFullName() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The password (in clear text).
     */
    private String password = null;

    public String getPassword() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The username for this user.
     */
    private String username = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * correctly.</p>
     */
    private String password2 = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * needed.</p>
     */
    private String task = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * locally until we are ready to create the object.</p>
     */
    private String password = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * <p>Field to store double-submit guard.</p>
     */
    private String token = null;


```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
     * locally until we are ready to create the object.</p>
     */
    private String username = null;


```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `message-resource/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
	private MessageStore messageStore;
	
	private static int helloCount = 0;
	
	public int getHelloCount() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
class MemorySubscriptionCreationFactory implements ObjectCreationFactory {

    private Digester digester = null;

    public Digester getDigester() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    private MemoryUserDatabase database = null;

    private Digester digester = null;

    public Digester getDigester() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
     * persistent data.
     */
    private String pathname = null;

    private String pathnameOld = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    private String pathnameOld = null;

    private String pathnameNew = null;

    public String getPathname() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    private String pathname = null;

    private String pathnameOld = null;

    private String pathnameNew = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    }

    private MemoryUserDatabase database = null;

    private Digester digester = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    private final HashMap<String, User> users = new HashMap<>();

    private boolean open = false;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `coding-actions/src/main/java/org/apache/struts/helloworld/action/HelloWorldAction.java`
#### Snippet
```java
    private MessageStore messageStore;
    
    private static int helloCount = 0;
    
    public int getHelloCount() {
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `crud/src/main/java/org/apache/struts/crud/model/Country.java`
#### Snippet
```java
 * @author antonio sánchez
 */
public class Country {
    private String countryId;
    private String countryName;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `namespace`
in `unknown-handler/src/main/java/org/apache/strutsexamples/web/TilesUnknownHandler.java`
#### Snippet
```java

        if (namespace.startsWith("/")) {
            namespace = namespace.substring(1);
        }

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `unknown-handler/src/main/java/org/apache/strutsexamples/web/TilesUnknownHandler.java`
#### Snippet
```java

        LOG.warn("Couldn't find tiles definition for namespace {}, action name {} and result code {}", namespace, actionName, resultCode);
        return null;
    }

```

### ReturnNull
Return of `null`
in `unknown-handler/src/main/java/org/apache/strutsexamples/web/TilesUnknownHandler.java`
#### Snippet
```java

    public ActionConfig handleUnknownAction(String namespace, String actionName) throws StrutsException {
        return null;
    }

```

### ReturnNull
Return of `null`
in `unknown-handler/src/main/java/org/apache/strutsexamples/web/TilesUnknownHandler.java`
#### Snippet
```java

    public Object handleUnknownActionMethod(Object action, String methodName) {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `type-conversion/src/main/java/org/apache/struts/example/ThemeDescriptorConverter.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `type-conversion/src/main/java/org/apache/struts/example/ThemeDescriptorConverter.java`
#### Snippet
```java
            LOG.error(new ParameterizedMessage("Unable to convert {} into a string", value), e);
        }
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
            // FIXME - localization - "error.host.unique")
            addFieldError(Constants.HOST,"That hostname is already defined");
            return null;
        }

```

### ReturnNull
Return of `null`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
        Subscription sub = getSubscription();
        if (null == sub) {
            return null;
        }
        return sub.getHost();
```

### ReturnNull
Return of `null`
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/MailreaderSupport.java`
#### Snippet
```java
        if (user != null) {
            this.addFieldError("username", "error.username.unique");
            return null;
        }

```

### ReturnNull
Return of `null`
in `crud/src/main/java/org/apache/struts/crud/dao/MemoryPersonDao.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `exception`
in `rest-angular/src/main/java/org/apache/examples/struts/interceptors/ExceptionHandlerInterceptor.java`
#### Snippet
```java
                    .renderResult(Action.INPUT);

                if(exception instanceof SecurityException) {
                    errors.put(ACTION_ERROR, "Operation not allowed!");
                    httpHeaders.setStatus(HttpServletResponse.SC_FORBIDDEN);
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUser.java`
#### Snippet
```java
    public String toString() {

        StringBuffer sb = new StringBuffer("<user username=\"");
        sb.append(getUsername());
        sb.append("\"");
```

### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
    public String toString() {

        StringBuffer sb = new StringBuffer("<subscription host=\"");
        sb.append(host);
        sb.append("\" autoConnect=\"");
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `carModelsAvailable` is redundant
in `exclude-parameters/src/main/java/org/apache/struts/edit/service/CarModelsServiceHardCoded.java`
#### Snippet
```java
	public String[] getCarModels() {
		
		String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
		
		return carModelsAvailable ;
```

### UnnecessaryLocalVariable
Local variable `carModelsAvailable` is redundant
in `preparable-interface/src/main/java/org/apache/struts/edit/service/CarModelsServiceHardCoded.java`
#### Snippet
```java
	public String[] getCarModels() {
		
		String [] carModelsAvailable = {"Ford","Chrysler","Toyota","Nissan"};
		
		return carModelsAvailable ;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `host` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The mail host for this subscription.
     */
    private String host = null;


```

### UnusedAssignment
Variable `user` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractSubscription.java`
#### Snippet
```java
     * The {@link User} with which we are associated.
     */
    private User user = null;


```

### UnusedAssignment
Variable `database` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The {@link UserDatabase} with which we are associated.
     */
    private UserDatabase database = null;


```

### UnusedAssignment
Variable `username` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/AbstractUser.java`
#### Snippet
```java
     * The username for this user.
     */
    private String username = null;


```

### UnusedAssignment
The value `null` assigned to `fis` is never used
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
            bis.close();
            bis = null;
            fis = null;
            this.open = true;

```

### UnusedAssignment
Variable `database` initializer `null` is redundant
in `mailreader2/src/main/java/org/apache/struts/examples/mailreader2/dao/impl/memory/MemoryUserDatabase.java`
#### Snippet
```java
    }

    private MemoryUserDatabase database = null;

    private Digester digester = null;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `id` is always 'null'
in `rest-angular/src/main/java/org/apache/examples/struts/actions/data/OrderController.java`
#### Snippet
```java
        }

        ordersService.remove(id);
        return "success";
    }
```

