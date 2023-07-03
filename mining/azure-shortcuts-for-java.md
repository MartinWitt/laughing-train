# azure-shortcuts-for-java 
 
# Bad smells
I found 362 bad smells with 192 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnnecessaryModifier | 179 | true |
| JavadocDeclaration | 61 | false |
| RedundantStringFormatCall | 42 | false |
| UnnecessaryCallToStringValueOf | 11 | false |
| UnnecessaryToStringCall | 10 | true |
| JavadocReference | 9 | false |
| DanglingJavadoc | 9 | false |
| StringBufferReplaceableByString | 7 | false |
| UNUSED_IMPORT | 6 | false |
| Deprecation | 4 | false |
| SimplifiableConditionalExpression | 4 | false |
| RedundantCast | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| DataFlowIssue | 2 | false |
| FieldMayBeFinal | 2 | false |
| UnnecessaryContinue | 2 | false |
| InnerClassMayBeStatic | 2 | true |
| CommentedOutCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| UnnecessaryLocalVariable | 1 | true |
| UnusedAssignment | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/LoadBalancer.java`
#### Snippet
```java
	 * A load balancer definition allowing to specify a front end IP address
	 */
	public interface DefinitionWithFrontEnd extends
		DefinitionCombos.WithPublicIpAddress<DefinitionCreatable> {
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/PublicIpAddress.java`
#### Snippet
```java
	 * A public IP address definition allowing to specify the leaf domain label, if any
	 */
	public interface DefinitionWithLeafDomainLabel {
		/**
		 * Specifies the leaf domain label to associate with this public IP address. The fully qualified domain name (FQDN) 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/LoadBalancer.java`
#### Snippet
```java
		DefinitionCreatable {}
	
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> { }
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/LoadBalancer.java`
#### Snippet
```java
	 */
	
	public interface Definition extends 
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/PublicIpAddress.java`
#### Snippet
```java
	 * A public IP address definition allowing to specify the IP address allocation method and a static IP address, if needed
	 */
	public interface DefinitionWithIpAddress {
		/**
		 * Enables static IP address allocation. The actual IP address allocated for this resource by Azure can be obtained 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/PublicIpAddress.java`
#### Snippet
```java
	 * A public IP address definition allowing to specify the resource group to include it in.
	 */
	public interface DefinitionWithGroup extends
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionCreatable> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/PublicIpAddress.java`
#### Snippet
```java
	 * A new blank public IP address definition
	 */
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/PublicIpAddress.java`
#### Snippet
```java
	String leafDomainLabel();

	public interface Definition extends 
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/PublicIpAddress.java`
#### Snippet
```java
	 * A public IP address definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionCreatable extends 
		Creatable<PublicIpAddress>,
		GroupResourceBase.DefinitionWithTags<DefinitionCreatable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/LoadBalancer.java`
#### Snippet
```java
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> { }
	
	public interface DefinitionWithGroup extends
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionWithFrontEnd> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/LoadBalancer.java`
#### Snippet
```java
	 */
	
	public interface DefinitionCreatable extends 
		Creatable<LoadBalancer>,
		GroupResourceBase.DefinitionWithTags<DefinitionCreatable> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public ArrayList<VirtualMachineExtension> extensions();
	public Integer platformFaultDomain();
	public Integer platformUpdateDomain();
	public String remoteDesktopThumbprint();
	public String vmAgentVersion();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public Integer platformUpdateDomain();
	public String remoteDesktopThumbprint();
	public String vmAgentVersion();
	public ArrayList<NetworkInterfaceReference> networkInterfaces();
	public String adminUserName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public String computerName();
	public String customData();
	public boolean isLinux();
	public boolean isWindows();
	public ImageReference image();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public ArrayList<NetworkInterfaceReference> networkInterfaces();
	public String adminUserName();
	public String computerName();
	public String customData();
	public boolean isLinux();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * but exposing additional optional inputs to specify
	 */
	public interface DefinitionCreatable extends
		DefinitionCombos.WithStorageAccount<DefinitionCreatable>,
		DefinitionWithSize<DefinitionCreatable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * @throws Exception
	 */
	public VirtualMachine start() throws Exception;
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * @throws Exception
	 */
	public VirtualMachine restart() throws Exception;

	/** 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public URI bootDiagnosticsStorage();
	public boolean isBootDiagnosticsEnabled();
	public URI availabilitySet();
	public ArrayList<VirtualMachineExtension> extensions();
	public Integer platformFaultDomain();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A new blank virtual machine definition requiring the first set of input parameters to be specified
	 */
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> {
		//TODO load balancers
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring the admin username to be specified
	 */
	public interface DefinitionWithAdminUsername {
		/**
		 * @param The desired admin username for the virtual machine
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition allowing a subnet with the selected virtual network to be associated with it
	 */
	public interface DefinitionWithSubnet extends 
		DefinitionCombos.WithSubnet<DefinitionWithPrivateIp> {
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition allowing to specify a data disk to attach to the VM
	 */
	public interface DefinitionWithDataDisk<R> {
		R withNewDataDisk(int diskSizeGB);
		R withExistingDataDisk(URI vhdUri);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public String size();
	public URI bootDiagnosticsStorage();
	public boolean isBootDiagnosticsEnabled();
	public URI availabilitySet();
	public ArrayList<VirtualMachineExtension> extensions();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition allowing to specify the size of the new virtual machine
	 */
	public interface DefinitionWithSize<T> {
		/**
		 * @param sizeName The name of the size for the virtual machine as text
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring the resource group to be specified
	 */
	public interface DefinitionWithGroup extends
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionWithNetworking> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public String customData();
	public boolean isLinux();
	public boolean isWindows();
	public ImageReference image();
	public List<DataDisk> dataDisks();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public String remoteDesktopThumbprint();
	public String vmAgentVersion();
	public ArrayList<NetworkInterfaceReference> networkInterfaces();
	public String adminUserName();
	public String computerName();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public Integer platformFaultDomain();
	public Integer platformUpdateDomain();
	public String remoteDesktopThumbprint();
	public String vmAgentVersion();
	public ArrayList<NetworkInterfaceReference> networkInterfaces();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public String vmAgentVersion();
	public ArrayList<NetworkInterfaceReference> networkInterfaces();
	public String adminUserName();
	public String computerName();
	public String customData();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring the admin password to be specified
	 */
	public interface DefinitionWithAdminPassword {
		/**
		 * @param password The desired admin password for the virtual machine
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public boolean isLinux();
	public boolean isWindows();
	public ImageReference image();
	public List<DataDisk> dataDisks();
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * @throws Exception
	 */
	public VirtualMachine deallocate() throws Exception;

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public boolean isBootDiagnosticsEnabled();
	public URI availabilitySet();
	public ArrayList<VirtualMachineExtension> extensions();
	public Integer platformFaultDomain();
	public Integer platformUpdateDomain();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	}
	
	public interface UpdateBlank {
		
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * @throws Exception
	 */
	public VirtualMachine generalize() throws Exception;


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition allowing the primary private IP address to be specified
	 */
	public interface DefinitionWithPrivateIp extends 
		DefinitionCombos.WithPrivateIpAddress<DefinitionWithPublicIp> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition allowing the networking to be specified
	 */
	public interface DefinitionWithNetworking extends 
		DefinitionCombos.WithNewNetwork<DefinitionWithPrivateIp>,
		DefinitionCombos.WithExistingNetwork<DefinitionWithSubnet>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition allowing the primary public IP address to be specified
	 */
	public interface DefinitionWithPublicIp extends
		DefinitionCombos.WithPublicIpAddress<DefinitionWithAdminUsername> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * @throws Exception 
	 */
	public VirtualMachine stop() throws Exception;

	/** 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	
	public String size();
	public URI bootDiagnosticsStorage();
	public boolean isBootDiagnosticsEnabled();
	public URI availabilitySet();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * @throws Exception
	 */
	public VirtualMachine capture(String containerName, String diskNamePrefix, boolean overwrite) throws Exception;

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public boolean isWindows();
	public ImageReference image();
	public List<DataDisk> dataDisks();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public URI availabilitySet();
	public ArrayList<VirtualMachineExtension> extensions();
	public Integer platformFaultDomain();
	public Integer platformUpdateDomain();
	public String remoteDesktopThumbprint();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public String adminUserName();
	public String computerName();
	public String customData();
	public boolean isLinux();
	public boolean isWindows();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	Deletable {
	
	public String size();
	public URI bootDiagnosticsStorage();
	public boolean isBootDiagnosticsEnabled();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java


	public interface Definition extends 
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition allowing the selection of a base image for the virtual machine
	 */
	public interface DefinitionWithImage {
		DefinitionCreatable withLatestImage(String publisher, String offer, String sku);
		DefinitionCreatable withImage(String publisher, String offer, String sku, String version);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring an existing virtual network to be specified
	 */
	public interface DefinitionWithExistingNetwork<T> {
		T withExistingNetwork(String network);
		T withExistingNetwork(Network network);		
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A blank update request for an existing virtual machine
	 */
	public interface UpdateBlank extends Deletable {
	}
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new Windows virtual machine definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionWindowsProvisionable extends 
		DefinitionWithAutoUpdate<DefinitionWindowsProvisionable>,
		WithComputerName<DefinitionWindowsProvisionable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring a region (location) to be specified 
	 */
	public interface DefinitionWithRegion<T> {
		T withRegion(String region);
		T withRegion(Region region);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition requiring the enablement of AutoUpdate to be specified
	 */
	public interface DefinitionWithAutoUpdate<T> {
		T withAutoUpdate(boolean autoUpdate);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring a deployment label to be specified
	 */
	public interface DefinitionWithDeploymentLabel<T> {
		T withDeploymentLabel(String label);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition requiring the computer name to be specified
	 */
	public interface WithComputerName<T> {
		T withComputerName(String name) throws Exception;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new Linux virtual machine definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionLinuxProvisionable extends 
		DefinitionWithHostName<DefinitionLinuxProvisionable>,
		DefinitionProvisionable {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring a subnet to be specified
	 */
	public interface DefinitionWithSubnet<T> {
		T withSubnet(String subnet);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new blank virtual machine definition requiring the initial required set of parameters to be specified
	 */
	public interface DefinitionBlank extends 
		DefinitionWithRegion<DefinitionWithSize>,
		DefinitionWithExistingNetwork<DefinitionWithSize>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring a deployment name to be specified
	 */
	public interface DefinitionWithDeployment<T> {
		T withDeployment(String name);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition requiring a VM size to be specified
	 */
	public interface DefinitionWithSize {
		DefinitionWithAdminUsername withSize(String size);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring the presence of a guest agent to be specified
	 */
	public interface DefinitionWithGuestAgent<T> {
		T withGuestAgent(boolean enabled);		
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring an new cloud service to be specified
	 */
	public interface DefinitionWithNewCloudService<T> {
		T withNewCloudService(String name);
		T withNewCloudService(CloudService.DefinitionProvisionable cloudServiceDefinition);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition requiring the host name to be specified
	 */
	public interface DefinitionWithHostName<T> {
		T withHostName(String name) throws Exception;
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionProvisionable extends 
		DefinitionWithTcpEndpoint<DefinitionProvisionable>,
		DefinitionWithGuestAgent<DefinitionProvisionable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring a TCP endpoint to be specified
	 */
	public interface DefinitionWithTcpEndpoint<T> {
		T withTcpEndpoint(int publicPort);
		T withTcpEndpoint(int publicPort, int privatePort);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition requiring a Linux or Windows images to be specified
	 */
	public interface DefinitionWithImage {
		DefinitionLinuxProvisionable withLinuxImage(String image);		
		DefinitionWindowsProvisionable withWindowsImage(String image);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring an existing cloud service to be specified
	 */
	public interface DefinitionWithExistingCloudService<T> {
		T withExistingCloudService(String serviceName);
		T withExistingCloudService(CloudService cloudService);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * An existing virtual machine update request ready to be applied in the cloud
	 */
	public interface Update extends UpdateBlank, Updatable<Update> {
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition requiring the admin password to be specified
	 */
	public interface DefinitionWithAdminPassword {
		DefinitionWithImage withAdminPassword(String password);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A new virtual machine definition requiring the admin username to be specified
	 */
	public interface DefinitionWithAdminUsername {
		DefinitionWithAdminPassword withAdminUsername(String name); 
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	 * A virtual machine definition requiring an existing storage account to specified
	 */
	public interface DefinitionWithExistingStorageAccount<T> {
		T withExistingStorageAccount(String name);
		T withExistingStorageAccount(StorageAccount account);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * A storage account definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionProvisionable extends 
		DefinitionWithType<DefinitionProvisionable>,
		DefinitionWithLabel<DefinitionProvisionable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * A storage account definition requiring the description to be specified
	 */
	public interface DefinitionWithDescription<T> {
		T withDescription(String description);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * A storage account definition requring the label to be specified
	 */
	public interface DefinitionWithLabel<T> {
		T withLabel(String label);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * A blank update request for an existing storage account
	 */
	public interface UpdateBlank extends Deletable {
		Update withType(String type);
		Update withDescription(String description);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * A new blank storage account definition
	 */
	public interface DefinitionBlank extends 
		DefinitionWithRegion<DefinitionProvisionable> {
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * A storage account definition requiring the region (location) to be specified
	 */
	public interface DefinitionWithRegion<T> {
		T withRegion(String region);
		T withRegion(Region region);		
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * A storage account definition requiring the storage type to be specified
	 */
	public interface DefinitionWithType<T> {
		T withType(String type);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/StorageAccount.java`
#### Snippet
```java
	 * An existing storage account update ready to be applied in the cloud
	 */
	public interface Update extends UpdateBlank, Updatable<Update> {
	}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Subnet.java`
#### Snippet
```java
		DefinitionAttachable<PARENT> {}
		
	public interface DefinitionBlank<PARENT> {
		DefinitionAttachable<PARENT> withAddressPrefix(String cidr);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Subnet.java`
#### Snippet
```java

public interface Subnet extends Indexable, Wrapper<com.microsoft.azure.management.network.models.Subnet> {
	public String addressPrefix();
	public String networkSecurityGroup();
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Subnet.java`
#### Snippet
```java
	public String networkSecurityGroup();
	
	public interface Definition<PARENT> extends
		DefinitionBlank<PARENT>,
		DefinitionAttachable<PARENT> {}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Subnet.java`
#### Snippet
```java
	}
	
	public interface DefinitionAttachable<PARENT> extends 
		Attachable<PARENT>,
		DefinitionCombos.WithExistingNetworkSecurityGroup<DefinitionAttachable<PARENT>> { 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Subnet.java`
#### Snippet
```java
public interface Subnet extends Indexable, Wrapper<com.microsoft.azure.management.network.models.Subnet> {
	public String addressPrefix();
	public String networkSecurityGroup();
	
	public interface Definition<PARENT> extends
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/ResourceGroup.java`
#### Snippet
```java
	 * A new blank resource group definition
	 */
	public interface DefinitionBlank {
		DefinitionCreatable withRegion(String regionName);
		DefinitionCreatable withRegion(Region region);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/ResourceGroup.java`
#### Snippet
```java
	 * A new resource group definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionCreatable extends 
		Creatable<ResourceGroup> {
		
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/ResourceGroup.java`
#### Snippet
```java

	
	public interface Definition extends
		DefinitionBlank,
		DefinitionCreatable {}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/ResourceGroup.java`
#### Snippet
```java
	 * An existing resource group modification request ready to be applied in the cloud
	 */
	public interface Update extends 
		UpdateBlank, 
		Updatable<Update> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/ResourceGroup.java`
#### Snippet
```java
	 * A blank modification request for an existing resource group
	 */
	public interface UpdateBlank extends 
		Deletable, 
		Taggable<Update>  {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/GroupResourceBase.java`
#### Snippet
```java
	ResourceBase {
	
	public String resourceGroup();

	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Size.java`
#### Snippet
```java

	
	public enum Type {
		BASIC_A0(VirtualMachineSizeTypes.BASIC_A0),
		BASIC_A1(VirtualMachineSizeTypes.BASIC_A1),
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> { }
	
	public interface DefinitionWithGroup extends
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionCreatable> {}
		
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
	 * A new virtual network definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionCreatable extends 
		Creatable<Network>,
		DefinitionWithAddressSpace,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
	 * A virtual network definition expecting at least one subnet to be specified
	 */
	public interface DefinitionWithSubnet {
		DefinitionCreatableWithSubnet withSubnet(String name, String cidr);
		DefinitionCreatableWithSubnet withSubnets(Map<String, String> nameCidrPairs);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
	 * A new blank virtual network definition
	 */
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> { }
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
	Subnet subnets(String id);
	
	public interface Definition extends 
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
	 * A virtual network definition expecting the IP address of an existing DNS server to be associated with the network 
	 */
	public interface DefinitionWithDnsServer {
		DefinitionCreatable withDnsServer(String ipAddress);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
	}
	
	public interface DefinitionCreatableWithSubnet extends 
		DefinitionCreatable,
		DefinitionWithSubnet { 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Network.java`
#### Snippet
```java
	 * A virtual network definition expecting the network's address space to be specified
	 */
	public interface DefinitionWithAddressSpace {
		DefinitionCreatableWithSubnet withAddressSpace(String cidr);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/AvailabilitySet.java`
#### Snippet
```java
	List<String> virtualMachineIds();
	
	public interface Definition extends
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/AvailabilitySet.java`
#### Snippet
```java
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionCreatable> {}
	
	public interface DefinitionCreatable extends 
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionCreatable>,
		GroupResourceBase.DefinitionWithTags<DefinitionCreatable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/AvailabilitySet.java`
#### Snippet
```java
	}
	
	public interface DefinitionWithGroup extends 
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionCreatable> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/AvailabilitySet.java`
#### Snippet
```java
		DefinitionCreatable {}
	
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> {
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/ResourceBase.java`
#### Snippet
```java
	
	public String type();
	public String name();
	public String region();
	public Map<String, String> tags();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/ResourceBase.java`
#### Snippet
```java
	public String name();
	public String region();
	public Map<String, String> tags();
	public Subscription subscription();
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/ResourceBase.java`
#### Snippet
```java
	Indexable {
	
	public String type();
	public String name();
	public String region();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/ResourceBase.java`
#### Snippet
```java
	public String region();
	public Map<String, String> tags();
	public Subscription subscription();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/ResourceBase.java`
#### Snippet
```java
	public String type();
	public String name();
	public String region();
	public Map<String, String> tags();
	public Subscription subscription();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate it with a network security group
	 */
	public interface WithExistingNetworkSecurityGroup<R> {
		R withExistingNetworkSecurityGroup(String id);
		R withExistingNetworkSecurityGroup(NetworkSecurityGroup nsg);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate a virtual network with it
	 */
	public interface WithNewNetwork<R> {
		/**
		 * Creates a new virtual network to associate with this resource, based on the provided definition
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
public interface DefinitionCombos {
	
	public interface WithExistingNetwork<R> {
		/**
		 * Associates an existing virtual network with this resource
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate it with a network security group
	 */
	public interface WithNewNetworkSecurityGroup<R> {
		R withNewNetworkSecurityGroup();
		R withNewNetworkSecurityGroup(String name);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate a storage account with this resource
	 */
	public interface WithStorageAccount<R> {
		/**
		 * Associates an existing storage account with this resource
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate a primary network interface with this resource
	 */
	public interface WithNewNetworkInterface<R> {
		/**
		 * Creates a new network interface to associate with this resource as its primary NIC, in the same region and group, 
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate an availability set with this resource
	 */
	public interface WithAvailabilitySet<R> {
		/**
		 * Associates an existing availability set with this resource
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate it with a private IP address within a virtual network subnet
	 */
	public interface WithPrivateIpAddress<R> {
		/**
		 * Enables dynamic private IP address allocation within the specified existing virtual network subnet as the primary subnet
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate it with a public IP address
	 */
	public interface WithPublicIpAddress<R> {
		/**
		 * Associates a public IP address that exists in the subscription with this resource
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to create a primary network interface associated with this resource
	 */
	public interface WithExistingNetworkInterface<R> {
		/**
		 * Selects an existing network interface as the primary NIC for this resource
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
	 * A resource definition allowing to associate a subnet with it
	 */
	public interface WithSubnet<R> {
		R withSubnet(String subnetId);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A cloud service definition requiring a reverse DNS fully qualified domain name to be specified
	 */
	public interface DefinitionWithReverseDnsFqdn<T> {
		public T withReverseDnsFqdn(String fqdn);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A cloud service definition requiring a description to be specified
	 */
	public interface DefinitionWithDescription<T> {
		public T withDescription(String description);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
		
		public Update withDescription(String description);
		public Update withReverseDnsFqdn(String fqdn);
		public Update withLabel(String label);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
		Deletable {
		
		public Update withDescription(String description);
		public Update withReverseDnsFqdn(String fqdn);
		public Update withLabel(String label);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A new blank cloud service definition
	 */
	public interface DefinitionBlank extends
		DefinitionWithRegion<DefinitionProvisionable>,
		DefinitionWithAffinityGroup<DefinitionProvisionable> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 */
	public interface DefinitionWithReverseDnsFqdn<T> {
		public T withReverseDnsFqdn(String fqdn);
	}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 */
	public interface DefinitionWithLabel<T> {
		public T withLabel(String label);
	}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A new cloud service definition with sufficient settings to be provisioned in the cloud
	 */
	public interface DefinitionProvisionable extends 
		DefinitionWithDescription<DefinitionProvisionable>,
		DefinitionWithLabel<DefinitionProvisionable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A cloud service definition requiring a label to be specified
	 */
	public interface DefinitionWithLabel<T> {
		public T withLabel(String label);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * An existing cloud service update request ready to applied in the cloud
	 */
	public interface Update extends UpdateBlank, Updatable<Update> {
	}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 */
	public interface DefinitionWithDescription<T> {
		public T withDescription(String description);
	}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A cloud service definition requiring a region to be specified
	 */
	public interface DefinitionWithRegion<T> {
		T withRegion(String region);
		T withRegion(Region region);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A blank existing cloud service update request
	 */
	public interface UpdateBlank extends 
		Deletable {
		
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
		public Update withDescription(String description);
		public Update withReverseDnsFqdn(String fqdn);
		public Update withLabel(String label);
	}
}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/CloudService.java`
#### Snippet
```java
	 * A cloud service definition requiring an affinity group to be specified
	 */
	public interface DefinitionWithAffinityGroup<T> {
		T withAffinityGroup(String affinityGroup);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	 * A new blank network definition
	 */
	public interface DefinitionBlank extends 
		DefinitionWithRegion<DefinitionWithAddressSpace> {
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	 * A virtual network definition requiring a new subnet to be specified
	 */
	public interface DefinitionWithSubnet<T> {
		T withSubnet(String name, String cidr);		
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	 * A blank update request for an existing network
	 */
	public interface UpdateBlank extends Deletable {
		// TODO?
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	String state() throws Exception;
	
	public interface Subnet extends Indexable {	
		String addressPrefix();
		String networkSecurityGroup();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	 * A new network definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionProvisionable extends 
		DefinitionWithSubnet<DefinitionProvisionable>,
		Creatable<UpdateBlank> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	 * A new network definition requiring the CIDR input parameter to be specified
	 */
	public interface DefinitionWithAddressSpace {
		DefinitionProvisionable withAddressSpace(String cidr);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	 * An existing network update request ready to be applied in the cloud
	 */
	public interface Update extends UpdateBlank, Updatable<Update> {
	}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/services/Network.java`
#### Snippet
```java
	 * A virtual network definition requiring a region to be specified
	 */
	public interface DefinitionWithRegion<T> {
		T withRegion(String region);
		T withRegion(Region region);		
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityGroup.java`
#### Snippet
```java
	 * An NSG definition allowing to specify the resource group to include it in.
	 */
	public interface DefinitionWithGroup extends
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionCreatable> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityGroup.java`
#### Snippet
```java
	 * A new blank NSG definition
	 */
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityGroup.java`
#### Snippet
```java
	Deletable {
	
	public interface Definition extends
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityGroup.java`
#### Snippet
```java
	 * An NSG definition with sufficient attributes specified to be provisioned in the cloud
	 */
	public interface DefinitionCreatable extends 
		Creatable<NetworkSecurityGroup>,
		GroupResourceBase.DefinitionWithTags<DefinitionCreatable> {
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
		
		private final String name;
		private AuthSettings(String name) {
			this.name = name;
		}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/Provider.java`
#### Snippet
```java
	ResourceType resourceTypes(String name) throws Exception;

	public interface ResourceType extends Indexable {
		List<String> apiVersions();
		String latestApiVersion();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	 * A network interface definition allowing to specify a subnet from the selected network to associate the network interface with
	 */
	public interface DefinitionWithSubnet extends 
		DefinitionCombos.WithSubnet<DefinitionWithPrivateIp> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	 * A network interface definition with sufficient input parameters specified to be provisioned in the cloud
	 */
	public interface DefinitionCreatable extends 
		Creatable<NetworkInterface>,
		DefinitionCombos.WithExistingNetworkSecurityGroup<DefinitionCreatable>,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	 * A network interface definition allowing to associate a virtual network with the network interface
	 */
	public interface DefinitionWithNetwork extends 
		DefinitionCombos.WithExistingNetwork<DefinitionWithSubnet>,
		DefinitionCombos.WithNewNetwork<DefinitionWithPrivateIp> {}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	 * A new blank network interface definition
	 */
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> {
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	 * A network interface definition allowing to associate it with a public IP address
	 */
	public interface DefinitionWithPublicIpAddress extends 
		DefinitionCombos.WithPublicIpAddress<DefinitionCreatable> { }	
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	 * A network interface definition allowing to specify a group to associate with it
	 */
	public interface DefinitionWithGroup extends
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionWithNetwork> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	 * A network interface definition allowing to assign a private IP address within an existing virtual network subnet
	 */
	public interface DefinitionWithPrivateIp extends 
		DefinitionCombos.WithPrivateIpAddress<DefinitionWithPublicIpAddress> {}	
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkInterface.java`
#### Snippet
```java
	Map<String, PublicIpAddress> publicIpAddresses();
	
	public interface Definition extends 
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	 * The possible permission types supported by a network security rule
	 */
	public enum Permission {
		ALLOW(SecurityRuleAccess.ALLOW),
		DENY(SecurityRuleAccess.DENY);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}
		
	public interface DefinitionWithDestinationAddress<PARENT> {
		DefinitionWithDestinationPort<PARENT> toAddress(String cidr);
		DefinitionWithDestinationPort<PARENT> toAnyAddress();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	public interface DefinitionBlank<PARENT> extends DefinitionWithDirectionPermission<PARENT> {}
	
	public interface DefinitionWithDirectionPermission<PARENT> {
		DefinitionWithSourceAddress<PARENT> allowInbound();
		DefinitionWithSourceAddress<PARENT> allowOutbound();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}
		
	public interface DefinitionWithSourcePort<PARENT> {
		DefinitionWithDestinationAddress<PARENT> fromPort(int port);
		DefinitionWithDestinationAddress<PARENT> fromAnyPort();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
		
		
	public interface DefinitionBlank<PARENT> extends DefinitionWithDirectionPermission<PARENT> {}
	
	public interface DefinitionWithDirectionPermission<PARENT> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}
		
	public interface DefinitionWithProtocol<PARENT> {
		DefinitionAttachable<PARENT> withProtocol(Protocol protocol);
		DefinitionAttachable<PARENT> withAnyProtocol();
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
		
		private final String name;
		private Permission(String name) {
			this.name = name;
		}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}
		
	public interface DefinitionAttachable<PARENT> extends Attachable<PARENT> {
		DefinitionAttachable<PARENT> withPriority(int priority);
	}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}
	
	public interface DefinitionWithDirection<PARENT> {
		DefinitionWithSourceAddress<PARENT> withInboundDirection();
		DefinitionWithSourceAddress<PARENT> withOutboundDirection();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}	
		
	public interface DefinitionWithDestinationPort<PARENT> {
		DefinitionWithProtocol<PARENT> toPort(int port);
		DefinitionWithProtocol<PARENT> toAnyPort();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}
		
	public interface DefinitionWithPermission<PARENT> {
		DefinitionWithDirection<PARENT> withAllowPermission();
		DefinitionWithDirection<PARENT> withDenyPermission();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	 * The possible directions of the network traffic supported by a network security rule
	 */
	public enum Direction {
		INBOUND(SecurityRuleDirection.INBOUND),
		OUTBOUND(SecurityRuleDirection.OUTBOUND);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	}
		
	public interface DefinitionWithSourceAddress<PARENT> {
		DefinitionWithSourcePort<PARENT> fromAddress(String cidr);
		DefinitionWithSourcePort<PARENT> fromAnyAddress();
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
	
	
	public interface Definition<PARENT> extends
		DefinitionBlank<PARENT>,
		DefinitionWithDirection<PARENT>,
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `src/com/microsoft/azure/shortcuts/resources/NetworkSecurityRule.java`
#### Snippet
```java
		
		private final String name;
		private Direction(String name) {
			this.name = name;
		}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	 * An existing storage account update request ready to be applied in the cloud.
	 */
	public interface Update extends 
		UpdateBlank, 
		Updatable<Update> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	public AccountType accountType();
	
	public interface Definition extends
		DefinitionBlank,
		DefinitionWithGroup,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	 * A new storage account definition allowing to specifiy the resource group to put it in
	 */
	public interface DefinitionWithGroup extends
		GroupResourceBase.DefinitionWithResourceGroup<DefinitionCreatable> {}
	
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	 * A new storage account definition with sufficient input parameters specified already to be provisioned in the cloud
	 */
	public interface DefinitionCreatable extends 
		GroupResourceBase.DefinitionWithTags<DefinitionCreatable>,
		Creatable<StorageAccount> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	 * @return The URL of the primary blob endpoint
	 */
	public URL primaryBlobEndpoint();
	
	/**
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	 * A blank modification request for an existing storage account
	 */
	public interface UpdateBlank extends 
		Deletable, 
		Taggable<Update> {
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	 * @return The type of the storage account
	 */
	public AccountType accountType();
	
	public interface Definition extends
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/com/microsoft/azure/shortcuts/resources/StorageAccount.java`
#### Snippet
```java
	 * A new blank storage account definition
	 */
	public interface DefinitionBlank extends 
		GroupResourceBase.DefinitionWithRegion<DefinitionWithGroup> { }
	
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `The`
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	public interface DefinitionWithAdminUsername {
		/**
		 * @param The desired admin username for the virtual machine
		 * @return The next stage of the VM definition
		 */
```

### JavadocReference
Cannot resolve symbol `region`
in `src/com/microsoft/azure/shortcuts/resources/common/ResourceBase.java`
#### Snippet
```java
	interface DefinitionWithRegion<T> {
		/**
		 * @param region The name of the location for the resource
		 * @return The next stage of the resource definition
		 */
```

### JavadocReference
Cannot resolve symbol `id`
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
		/**
		 * Associates an existing availability set with this resource
		 * @param id The resource ID of an existing availability set
		 * @return The next stage of the resource definition
		 */
```

### JavadocReference
Cannot resolve symbol `subnet`
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
		/**
		 * Enables dynamic private IP address allocation within the specified existing virtual network subnet as the primary subnet
		 * @param subnet The Subnet to associate with the resource
		 * @return The next stage of the definition
		 */
```

### JavadocReference
Cannot resolve symbol `An`
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
		/**
		 * Associates an existing storage account with this resource
		 * @param An existing storage account to associate with this resource
		 * @return The next stage of the resource definition
		 */
```

### JavadocReference
Cannot resolve symbol `name`
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
		/**
		 * Associates an existing storage account with this resource
		 * @param name The name of an existing storage account to associate with this resource
		 * @return The next stage of the resource definition
		 */
```

### JavadocReference
Cannot resolve symbol `subnet`
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
		/**
		 * Assigns the specified static IP address within the specified existing virtual network subnet as the primary subnet
		 * @param subnet The Subnet to associate with this resource
		 * @param staticPrivateIpAddress The static private IP address within the specified subnet to assign to this resource
		 * @return The next stage of the definition
```

### JavadocReference
Cannot resolve symbol `id`
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
		/**
		 * Associates an existing virtual network with this resource
		 * @param id The resource ID of the virtual network to associate with the resource
		 * @return The next stage of the resource definition
		 */
```

### JavadocReference
Cannot resolve symbol `The`
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
    
    /**
     * @param The file containing the credentials as a Java properties file
     * @param subscriptionId The desired subscription, if any
     * @return The Configuration object
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `id` may produce `NullPointerException`
in `src/com/microsoft/azure/shortcuts/resources/implementation/LoadBalancerImpl.java`
#### Snippet
```java
		PublicIpAddress pip = ensurePublicIpAddress();
		ResourceId r  = new ResourceId();
		r.setId(pip.id());
		FrontendIpConfiguration ipConfig = new FrontendIpConfiguration();
		this.inner().getFrontendIpConfigurations().add(ipConfig);
```

### DataFlowIssue
Argument `Region.fromName(locationFromId(id))` might be null
in `src/com/microsoft/azure/shortcuts/resources/implementation/PublishersImpl.java`
#### Snippet
```java
	@Override
	public Publisher get(String id) throws Exception {
		return get(Region.fromName(locationFromId(id)), id);
	}

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.microsoft.azure.shortcuts.resources.NetworkSecurityGroup;`
in `src/com/microsoft/azure/shortcuts/resources/samples/TestVM.java`
#### Snippet
```java


import com.microsoft.azure.shortcuts.resources.NetworkSecurityGroup;
import com.microsoft.azure.shortcuts.resources.Protocol;
import com.microsoft.azure.shortcuts.resources.Region;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.shortcuts.resources.Protocol;`
in `src/com/microsoft/azure/shortcuts/resources/samples/TestVM.java`
#### Snippet
```java

import com.microsoft.azure.shortcuts.resources.NetworkSecurityGroup;
import com.microsoft.azure.shortcuts.resources.Protocol;
import com.microsoft.azure.shortcuts.resources.Region;
import com.microsoft.azure.shortcuts.resources.Size;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.shortcuts.resources.Region;`
in `src/com/microsoft/azure/shortcuts/resources/samples/TestVM.java`
#### Snippet
```java
import com.microsoft.azure.shortcuts.resources.NetworkSecurityGroup;
import com.microsoft.azure.shortcuts.resources.Protocol;
import com.microsoft.azure.shortcuts.resources.Region;
import com.microsoft.azure.shortcuts.resources.Size;
import com.microsoft.azure.shortcuts.resources.StorageAccount;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.shortcuts.resources.Size;`
in `src/com/microsoft/azure/shortcuts/resources/samples/TestVM.java`
#### Snippet
```java
import com.microsoft.azure.shortcuts.resources.Protocol;
import com.microsoft.azure.shortcuts.resources.Region;
import com.microsoft.azure.shortcuts.resources.Size;
import com.microsoft.azure.shortcuts.resources.StorageAccount;
import com.microsoft.azure.shortcuts.resources.VirtualMachine;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.shortcuts.resources.StorageAccount;`
in `src/com/microsoft/azure/shortcuts/resources/samples/TestVM.java`
#### Snippet
```java
import com.microsoft.azure.shortcuts.resources.Region;
import com.microsoft.azure.shortcuts.resources.Size;
import com.microsoft.azure.shortcuts.resources.StorageAccount;
import com.microsoft.azure.shortcuts.resources.VirtualMachine;
import com.microsoft.azure.shortcuts.resources.implementation.Subscription;
```

### UNUSED_IMPORT
Unused import `import com.microsoft.azure.shortcuts.resources.VirtualMachine;`
in `src/com/microsoft/azure/shortcuts/resources/samples/TestVM.java`
#### Snippet
```java
import com.microsoft.azure.shortcuts.resources.Size;
import com.microsoft.azure.shortcuts.resources.StorageAccount;
import com.microsoft.azure.shortcuts.resources.VirtualMachine;
import com.microsoft.azure.shortcuts.resources.implementation.Subscription;

```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `null` to `String` is redundant
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkInterfaceImpl.java`
#### Snippet
```java
	@Override
	public DefinitionCreatable withNewNetworkSecurityGroup() {
		return this.withNewNetworkSecurityGroup((String)null);
	}

```

### RedundantCast
Casting `null` to `String` is redundant
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkableGroupableResourceBaseImpl.java`
#### Snippet
```java

	final public WRAPPERIMPL withNewNetwork(String addressSpace) {
		return this.withNewNetwork((String)null, addressSpace);
	}
	
```

### RedundantCast
Casting `null` to `String` is redundant
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
		
		return ManagementConfiguration.configure(
			(String)null, 
			baseUri,
			subscriptionId,
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	/**
	 * Stops (powers off) the virtual machine without deallocating it. Charges keep accruing.
	 * @throws Exception 
	 */
	public VirtualMachine stop() throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	 * @param diskNamePrefix The prefix to use for the name of the virtual hard disk for the image
	 * @param overwrite Determines whether to overwrite an existing image VHD, if any
	 * @throws Exception
	 */
	public VirtualMachine capture(String containerName, String diskNamePrefix, boolean overwrite) throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	/**
	 * Starts a stopped virtual machine.
	 * @throws Exception
	 */
	public VirtualMachine start() throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	/** 
	 * Deallocates a virtual machine. Charges no longer accrue.
	 * @throws Exception
	 */
	public VirtualMachine deallocate() throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	/** 
	 * Restarts a virtual machine
	 * @throws Exception
	 */
	public VirtualMachine restart() throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/VirtualMachine.java`
#### Snippet
```java
	/**
	 * Sets the state of the virtual machine as generalized, which is required for capturing an image
	 * @throws Exception
	 */
	public VirtualMachine generalize() throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/GroupableResourceBaseImpl.java`
#### Snippet
```java
	/**************************************************
	 * Helpers
	 * @throws Exception 
	 **************************************************/
	final protected ResourceGroup ensureGroup() throws Exception {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/implementation/CloudServicesImpl.java`
#### Snippet
```java
		/***********************************************************
		 * Getters
		 * @throws Exception 
		 ***********************************************************/

```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/implementation/StorageAccountsImpl.java`
#### Snippet
```java
		/***********************************************************
		 * Getters
		 * @throws Exception 
		 ***********************************************************/

```

### JavadocDeclaration
`@param supportingVM` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/Sizes.java`
#### Snippet
```java

	/**
	 * @param supportingVM
	 * @param supportingCloudServices
	 * @return List of available size names supporting the specified type of compute service
```

### JavadocDeclaration
`@param supportingCloudServices` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/Sizes.java`
#### Snippet
```java
	/**
	 * @param supportingVM
	 * @param supportingCloudServices
	 * @return List of available size names supporting the specified type of compute service
	 */
```

### JavadocDeclaration
`@param region` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Sizes.java`
#### Snippet
```java

	/**
	 * @param region
	 * @return Virtual machine sizes available in the specified region
	 * @throws Exception 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Sizes.java`
#### Snippet
```java
	 * @param region
	 * @return Virtual machine sizes available in the specified region
	 * @throws Exception 
	 */
	Map<String, Size> asMap(String region) throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/common/implementation/Utils.java`
#### Snippet
```java
	 * @param ignoreErrorStream :Set to true if exception is to be thrown when the error stream is not empty.
	 * @return result :The text contents of the output of the invoked command
	 * @throws Exception
	 * @throws IOException
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/common/implementation/Utils.java`
#### Snippet
```java
	 * @return result :The text contents of the output of the invoked command
	 * @throws Exception
	 * @throws IOException
	 */
	private static String invokeCommand(String[] command, boolean ignoreErrorStream) throws Exception, IOException {
```

### JavadocDeclaration
`@param shortName` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	/**
	 * Deletes a resource found using its name, type, provider namespace and group name
	 * @param shortName
	 * @param type
	 * @param provider
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * Deletes a resource found using its name, type, provider namespace and group name
	 * @param shortName
	 * @param type
	 * @param provider
	 * @param group
```

### JavadocDeclaration
`@param provider` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * @param shortName
	 * @param type
	 * @param provider
	 * @param group
	 * @throws Exception 
```

### JavadocDeclaration
`@param group` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * @param type
	 * @param provider
	 * @param group
	 * @throws Exception 
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * @param provider
	 * @param group
	 * @throws Exception 
	 */
	void delete(String shortName, String type, String provider, String group) throws Exception;
```

### JavadocDeclaration
`@param shortName` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	/**
	 * Gets a resource using its name, type, provider namespace and group name
	 * @param shortName
	 * @param type
	 * @param provider
```

### JavadocDeclaration
`@param type` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * Gets a resource using its name, type, provider namespace and group name
	 * @param shortName
	 * @param type
	 * @param provider
	 * @param group
```

### JavadocDeclaration
`@param provider` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * @param shortName
	 * @param type
	 * @param provider
	 * @param group
	 * @return
```

### JavadocDeclaration
`@param group` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * @param type
	 * @param provider
	 * @param group
	 * @return
	 * @throws Exception 
```

### JavadocDeclaration
`@return` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * @param provider
	 * @param group
	 * @return
	 * @throws Exception 
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/Resources.java`
#### Snippet
```java
	 * @param group
	 * @return
	 * @throws Exception 
	 */
	Resource get(String shortName, String type, String provider, String group) throws Exception;
```

### JavadocDeclaration
`@param groupName` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/common/SupportsListingAsMapByGroup.java`
#### Snippet
```java
	/**
	 * Lists the entities in a specific group
 	 * @param groupName
	 * @return
	 * @throws Exception
```

### JavadocDeclaration
`@return` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/common/SupportsListingAsMapByGroup.java`
#### Snippet
```java
	 * Lists the entities in a specific group
 	 * @param groupName
	 * @return
	 * @throws Exception
	 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/common/SupportsListingAsMapByGroup.java`
#### Snippet
```java
 	 * @param groupName
	 * @return
	 * @throws Exception
	 */
	Map<String, T> asMap(String groupName) throws Exception;
```

### JavadocDeclaration
`@param subnet` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/common/DefinitionCombos.java`
#### Snippet
```java
		 * Creates a new network interface to associate with this resource as its primary NIC, in the same region and group, 
		 * using a name derived from the name of this resource, within the provided existing subnet, with dynamic private IP allocation enabled
		 * @param subnet
		 * @return The next stage of the resource definition
		 */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/ProviderImpl.java`
#### Snippet
```java
	/***********************************************************
	 * Getters
	 * @throws Exception 
	 ***********************************************************/		

```

### JavadocDeclaration
`@param serviceType` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/Regions.java`
#### Snippet
```java
	/**
	 * 
	 * @param serviceType
	 * @return Regions supporting a specific service type from the LocationAvailableServiceNames class
	 * @throws Exception
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/Regions.java`
#### Snippet
```java
	 * @param serviceType
	 * @return Regions supporting a specific service type from the LocationAvailableServiceNames class
	 * @throws Exception
	 */
	Map<String, Region> list(String serviceType) throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/SizesImpl.java`
#### Snippet
```java
	/*******************************************************
	 * Helpers
	 * @throws URISyntaxException 
	 * @throws ServiceException 
	 * @throws IOException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/SizesImpl.java`
#### Snippet
```java
	 * Helpers
	 * @throws URISyntaxException 
	 * @throws ServiceException 
	 * @throws IOException 
	 *******************************************************/
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/SizesImpl.java`
#### Snippet
```java
	 * @throws URISyntaxException 
	 * @throws ServiceException 
	 * @throws IOException 
	 *******************************************************/
	
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * />
     * </azureShortcutsAuth>
     * @throws ParserConfigurationException 
     * @throws IOException 
     * @throws InterruptedException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * </azureShortcutsAuth>
     * @throws ParserConfigurationException 
     * @throws IOException 
     * @throws InterruptedException 
     * @throws ExecutionException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws ParserConfigurationException 
     * @throws IOException 
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws IOException 
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     * @throws SAXException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     * @throws SAXException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     * @throws SAXException 
     */
    private static Configuration configurationFromXml(File authFile, String subscriptionId) 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @param subscriptionId The desired subscription, if any
     * @return The Configuration object
     * @throws IOException 
     * @throws InterruptedException 
     * @throws ExecutionException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @return The Configuration object
     * @throws IOException 
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws IOException 
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     */
    private static Configuration configurationFromProperties(File authFile, String subscriptionId) 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @param subscriptionId The desired subscription id, if any
     * @return The Configuration object 
     * @throws IOException 
     * @throws SAXException 
     * @throws InterruptedException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @return The Configuration object 
     * @throws IOException 
     * @throws SAXException 
     * @throws InterruptedException 
     * @throws ExecutionException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws IOException 
     * @throws SAXException 
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws SAXException 
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/common/SupportsDeletingByGroup.java`
#### Snippet
```java
	 * @param groupName The group the resource is part of
	 * @param name The name of the resource within that group
	 * @throws Exception
	 */
	void delete(String groupName, String name) throws Exception;
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws InterruptedException 
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     * @throws ParserConfigurationException 
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws ExecutionException 
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     * @throws ParserConfigurationException 
     */
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
     * @throws URISyntaxException 
     * @throws ServiceUnavailableException 
     * @throws ParserConfigurationException 
     */
    private static Configuration configurationFromFile(File authFile, String subscriptionId) 
```

### JavadocDeclaration
`@param publishSettingsPath` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/implementation/Azure.java`
#### Snippet
```java
	
	/**
	 * @param publishSettingsPath
	 * @param subscriptionId
	 * @return Authenticated Azure client exposing access to ASM-based ("Classic") services
```

### JavadocDeclaration
`@param subscriptionId` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/implementation/Azure.java`
#### Snippet
```java
	/**
	 * @param publishSettingsPath
	 * @param subscriptionId
	 * @return Authenticated Azure client exposing access to ASM-based ("Classic") services
	 * @throws IOException
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/implementation/Azure.java`
#### Snippet
```java
	 * @param subscriptionId
	 * @return Authenticated Azure client exposing access to ASM-based ("Classic") services
	 * @throws IOException
	 */
	public static Azure authenticate(String publishSettingsPath, String subscriptionId) throws IOException {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/com/microsoft/azure/shortcuts/services/implementation/VirtualMachinesImpl.java`
#### Snippet
```java
		/*************************************************************
		 * Helpers
		 * @throws Exception 
		 *************************************************************/
		
```

### JavadocDeclaration
Exception is not declared to be thrown by method ensureOSConfigurationSet
in `src/com/microsoft/azure/shortcuts/services/implementation/VirtualMachinesImpl.java`
#### Snippet
```java
		/*************************************************************
		 * Helpers
		 * @throws Exception 
		 *************************************************************/
		
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `azureSubnet` may be 'final'
in `src/com/microsoft/azure/shortcuts/services/implementation/NetworksImpl.java`
#### Snippet
```java
			implements Network.Subnet {
			
			private com.microsoft.windowsazure.management.network.models.NetworkListResponse.Subnet azureSubnet;

			public SubnetImpl(com.microsoft.windowsazure.management.network.models.NetworkListResponse.Subnet azureSubnet) {
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `src/com/microsoft/azure/shortcuts/resources/implementation/Subscription.java`
#### Snippet
```java
    public static String ARM_AAD_URL = "https://login.windows.net/";

    private Configuration configuration;
    private ResourceManagementClient resourceManagementClient;
    private StorageManagementClient storageManagementClient;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/com/microsoft/azure/shortcuts/services/VirtualMachine.java`
#### Snippet
```java
	String affinityGroup() throws Exception;
	DeploymentStatus status() throws Exception;
	//boolean isLinux() throws Exception; //TODO: Currently broken in the SDK/Azure
	//boolean isWindows() throws Exception; // TODO: Currently broken in the SDK/Azure
	String roleName() throws Exception;
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/ResourceGroupsSample.java`
#### Snippet
```java
    	
    	// Create a resource group
    	String groupName = "group" + String.valueOf(System.currentTimeMillis());
    	System.out.println("Creating group " + groupName);
    	subscription.resourceGroups().define(groupName)
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/services/samples/CloudServicesSample.java`
#### Snippet
```java
	// Tests cloud service implementation
	public static void test(Azure azure) throws Exception {
		final String serviceName = "svc" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating cloud service named '%s'...", serviceName));

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/services/samples/NetworksSample.java`
#### Snippet
```java
		
		// Create a network with multiple subnets
		networkName = "net" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating virtual network named '%s'...", networkName));
		azure.networks().define(networkName)
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/services/samples/NetworksSample.java`
#### Snippet
```java

		// Create network with default subnet
		networkName = "net" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating virtual network named '%s'...", networkName));
		azure.networks().define(networkName)
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/services/samples/StorageAccountsSample.java`
#### Snippet
```java
	
	public static void test(Azure azure) throws Exception {
		final String accountName = "store" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating account named '%s'...", accountName));
		
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/PublicIpAddressesSample.java`
#### Snippet
```java

    public static void test(Subscription subscription) throws Exception {
    	String newPublicIpAddressName = "pip" + String.valueOf(System.currentTimeMillis());
    	
    	// Listing all public IP addresses
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/StorageAccountsSample.java`
#### Snippet
```java

    public static void test(Subscription subscription) throws Exception {
    	String newStorageAccountName = "store" + String.valueOf(System.currentTimeMillis());
    	String newGroupName = "testgroup";
    	
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkSecurityRuleImpl.java`
#### Snippet
```java
	@Override
	public NetworkSecurityRuleImpl toPortRange(int from, int to) {
		this.inner().setDestinationPortRange(String.valueOf(from) + "-" + String.valueOf(to));
		return this;
	}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkSecurityRuleImpl.java`
#### Snippet
```java
	@Override
	public NetworkSecurityRuleImpl toPortRange(int from, int to) {
		this.inner().setDestinationPortRange(String.valueOf(from) + "-" + String.valueOf(to));
		return this;
	}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkSecurityRuleImpl.java`
#### Snippet
```java
	@Override
	public NetworkSecurityRuleImpl fromPortRange(int from, int to) {
		this.inner().setSourcePortRange(String.valueOf(from) + "-" + String.valueOf(to));
		return this;
	}
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkSecurityRuleImpl.java`
#### Snippet
```java
	@Override
	public NetworkSecurityRuleImpl fromPortRange(int from, int to) {
		this.inner().setSourcePortRange(String.valueOf(from) + "-" + String.valueOf(to));
		return this;
	}
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkInterfaceImpl.java`
#### Snippet
```java
				ResourceId pipId = ipConfig.getPublicIpAddress();
				if(pipId == null) {
					continue;
				} else {
					PublicIpAddress pip = this.subscription().publicIpAddresses(pipId.getId());
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/com/microsoft/azure/shortcuts/services/implementation/VirtualMachinesImpl.java`
#### Snippet
```java
				}
			} catch (Exception e) {
				continue;
			}
		}
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkInterfaceImpl.java`
#### Snippet
```java
				}
			}
		} catch (Exception e) {
		}
		return pips;
```

## RuleId[id=Deprecation]
### Deprecation
'URL(java.net.URL, java.lang.String)' is deprecated
in `src/com/microsoft/azure/shortcuts/resources/implementation/VirtualMachineImpl.java`
#### Snippet
```java
			// Autogenerate URI from name
			if(vhd.getUri() == null) {
				URL container = new URL(storageAccount.primaryBlobEndpoint(), this.name() + "/");
				URL diskBlob = new URL(container, dataDisk.getName() + ".vhd");
				vhd.setUri(diskBlob.toString());
```

### Deprecation
'URL(java.net.URL, java.lang.String)' is deprecated
in `src/com/microsoft/azure/shortcuts/resources/implementation/VirtualMachineImpl.java`
#### Snippet
```java
			if(vhd.getUri() == null) {
				URL container = new URL(storageAccount.primaryBlobEndpoint(), this.name() + "/");
				URL diskBlob = new URL(container, dataDisk.getName() + ".vhd");
				vhd.setUri(diskBlob.toString());
			}
```

### Deprecation
'URL(java.net.URL, java.lang.String)' is deprecated
in `src/com/microsoft/azure/shortcuts/resources/implementation/VirtualMachineImpl.java`
#### Snippet
```java
		ensureDataDisks(storageAccount);
		
		URL container = new URL(storageAccount.primaryBlobEndpoint(), this.name() + "/");
		URL diskBlob = new URL(container, "osDisk.vhd");
		this.inner().getStorageProfile().getOSDisk().getVirtualHardDisk().setUri(diskBlob.toString());
```

### Deprecation
'URL(java.net.URL, java.lang.String)' is deprecated
in `src/com/microsoft/azure/shortcuts/resources/implementation/VirtualMachineImpl.java`
#### Snippet
```java
		
		URL container = new URL(storageAccount.primaryBlobEndpoint(), this.name() + "/");
		URL diskBlob = new URL(container, "osDisk.vhd");
		this.inner().getStorageProfile().getOSDisk().getVirtualHardDisk().setUri(diskBlob.toString());
	
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `resource` is redundant
in `src/com/microsoft/azure/shortcuts/resources/implementation/ResourcesImpl.java`
#### Snippet
```java
	private Resource get(String group, ResourceIdentity identity) throws Exception {
		GenericResourceExtended azureResource= subscription.resourceManagementClient().getResourcesOperations().get(group, identity).getResource();
		ResourceImpl resource = new ResourceImpl(azureResource, this);
		return resource;
	}
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder output` can be replaced with 'String'
in `src/com/microsoft/azure/shortcuts/resources/samples/AvailabilitySetSample.java`
#### Snippet
```java
    
    private static void printAvailabilitySet(AvailabilitySet availabilitySet) throws Exception {
    	StringBuilder output = new StringBuilder();
    	output
    		.append(String.format("Availability set id: %s\n", availabilitySet.id()))
```

### StringBufferReplaceableByString
`StringBuilder info` can be replaced with 'String'
in `src/com/microsoft/azure/shortcuts/services/samples/VirtualMachinesSample.java`
#### Snippet
```java
	
	private static void printVM(VirtualMachine vm) throws Exception {
		StringBuilder info = new StringBuilder();
		info
			.append("Information about vm: ").append(vm.roleName()).append("\n")
```

### StringBufferReplaceableByString
`StringBuilder output` can be replaced with 'String'
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworkSecurityGroupsSample.java`
#### Snippet
```java
    
    private static void printNSG(NetworkSecurityGroup nsg) throws Exception {
    	StringBuilder output = new StringBuilder();
    	output
    		.append(String.format("Network Security Group ID: %s\n", nsg.id()))
```

### StringBufferReplaceableByString
`StringBuilder info` can be replaced with 'String'
in `src/com/microsoft/azure/shortcuts/resources/samples/VirtualMachinesSample.java`
#### Snippet
```java
    
    private static void printVM(VirtualMachine vm) {
		StringBuilder info = new StringBuilder();
		info
			.append(String.format("Information about vm: %s\n", vm.id()))
```

### StringBufferReplaceableByString
`StringBuilder output` can be replaced with 'String'
in `src/com/microsoft/azure/shortcuts/resources/samples/PublicIpAddressesSample.java`
#### Snippet
```java
    
    private static void printPIP(PublicIpAddress pip) throws Exception {
    	StringBuilder output = new StringBuilder();
    	output
    		.append(String.format("Public IP ID: %s\n", pip.id()))
```

### StringBufferReplaceableByString
`StringBuilder output` can be replaced with 'String'
in `src/com/microsoft/azure/shortcuts/resources/samples/StorageAccountsSample.java`
#### Snippet
```java
    
    private static void printStorageAccount(StorageAccount storageAccount) throws Exception {
    	StringBuilder output = new StringBuilder();
    	output
    		.append(String.format("Storage account id: %s\n", storageAccount.id()))
```

### StringBufferReplaceableByString
`StringBuilder output` can be replaced with 'String'
in `src/com/microsoft/azure/shortcuts/resources/samples/LoadBalancersSample.java`
#### Snippet
```java
    
    private static void printLB(LoadBalancer lb) throws Exception {
    	StringBuilder output = new StringBuilder();
    	output
    		.append(String.format("Load Balancer ID: %s\n", lb.id()))
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/AvailabilitySetSample.java`
#### Snippet
```java
    	// Listing availability sets in a specific resource group
    	Map<String, AvailabilitySet> availabilitySets = subscription.availabilitySets().asMap(availabilitySet.resourceGroup());
    	System.out.println(String.format("Availability set ids in group '%s': \n\t%s", 
    			availabilitySet.resourceGroup(), StringUtils.join(availabilitySets.keySet(), ",\n\t")));
    		
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/VirtualMachinesSample.java`
#### Snippet
```java
		// Create a Linux VM in a new service
		final String vmName = "vm" + timeStamp;
		System.out.println(String.format("Creating virtual machine named '%s'...", vmName));
		azure.virtualMachines().define(vmName)
			.withRegion("West US")
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/VirtualMachinesSample.java`
#### Snippet
```java
		// Create a new network
		final String network = "net" + timeStamp;
		System.out.println(String.format("Creating virtual network named '%s'...", network));
		azure.networks().define(network)		
			.withRegion("West US")
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/VirtualMachinesSample.java`
#### Snippet
```java
		// Create a Linux VM in that network
		final String vmName2 = "vl" + timeStamp;
		System.out.println(String.format("Creating virtual machine named '%s'...", vmName2));
		final String cloudService2 = "cs" + timeStamp;
		azure.virtualMachines().define(vmName2)
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworkSecurityGroupsSample.java`
#### Snippet
```java
    	// Listing NSGs in a specific resource group
    	nsgs = subscription.networkSecurityGroups().asMap(groupNameCreated);
    	System.out.println(String.format("NSG ids in group '%s': \n\t%s", groupNameCreated, StringUtils.join(nsgs.keySet(), ",\n\t")));
    	
    	// Get info about a specific PIP using its resource ID
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworkInterfacesSample.java`
#### Snippet
```java
    		.append(String.format("\tPrimary subnet ID: %s\n", ipConfig.getSubnet().getId()))
    		.append(String.format("\tPrimary private IP: %s\n", ipConfig.getPrivateIpAddress()))
    		.append(String.format("\tPublic IPs:\n"));
    	for(PublicIpAddress pip : pips.values()) {
    		output
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworkInterfacesSample.java`
#### Snippet
```java
    	// Listing network interfaces in a specific resource group
    	nics = subscription.networkInterfaces().asMap(newGroupName);
    	System.out.println(String.format("Network interface ids in group '%s': \n\t%s", newGroupName, StringUtils.join(nics.keySet(), ",\n\t")));

    	nic.delete();
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/RegionsSample.java`
#### Snippet
```java
	
	private static void printRegion(Region region) throws Exception {
		System.out.println(String.format("Region: %s\n"
				+ "\tDisplay name: %s\n"
				+ "\tAvailable VM sizes: %s\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworksSample.java`
#### Snippet
```java
    	// Listing networks in a specific resource group
    	Map<String, Network> networks = subscription.networks().asMap(existingGroupName);
    	System.out.println(String.format("Network ids in group '%s': \n\t%s", existingGroupName, StringUtils.join(networks.keySet(), ",\n\t")));
    	
    	// Clean up
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworksSample.java`
#### Snippet
```java
    	// Listing all networks
    	Map<String, Network> networks = subscription.networks().asMap();
    	System.out.println(String.format("Network ids: \n\t%s", StringUtils.join(networks.keySet(), ",\n\t")));
    	
    	// Clean up
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ResourcesSample.java`
#### Snippet
```java
    	// Listing all resource names
    	Map<String, Resource> resources = subscription.resources().asMap();
    	System.out.println(String.format("Resource ids: %s\n\t", StringUtils.join(resources.keySet(), ",\n\t")));

    	// Listing resources in a specific group
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ResourcesSample.java`
#### Snippet
```java
    	    	
    	// Delete a resource 
        System.out.println(String.format("Deleting resource '%s' of type '%s' by provider '%s' in group '%s'",
        	resource.name(),
        	resource.type(),
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ResourcesSample.java`
#### Snippet
```java
    private static void printResource(Resource resource) throws Exception {
    	
		System.out.println(String.format("Found resource ID: %s\n"
			+ "\tGroup: %s\n"
			+ "\tProvider: %s\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/OSImagesSample.java`
#### Snippet
```java
	
	private static void printOsImage(OSImage osImage) throws Exception {
		System.out.println(String.format("Found image: %s\n"
				+ "\tCategory: %s\n"
				+ "\tDescription: %s\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ResourceGroupsSample.java`
#### Snippet
```java

    private static void printGroup(ResourceGroup group) throws Exception {
		System.out.println(String.format("Group: %s\n"
			+ "\tRegion: %s\n"
			+ "\tID: %s\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/CloudServicesSample.java`
#### Snippet
```java
	public static void test(Azure azure) throws Exception {
		final String serviceName = "svc" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating cloud service named '%s'...", serviceName));

		// Create a new cloud service
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/CloudServicesSample.java`
#### Snippet
```java

		// Update cloud service
		System.out.println(String.format("Updating cloud service named '%s'...", serviceName));

		azure.cloudServices().update(serviceName)
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/CloudServicesSample.java`
#### Snippet
```java

		// Delete the newly created cloud service
		System.out.println(String.format("Deleting cloud service named '%s'...", serviceName));
		azure.cloudServices().delete(serviceName);
		
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/CloudServicesSample.java`
#### Snippet
```java
	
	private static void printCloudService(CloudService cloudService) throws Exception {
		System.out.println(String.format("Cloud service: %s\n"
				+ "\tLabel: %s\n"
				+ "\tDescription: %s\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ProvidersSample.java`
#### Snippet
```java
    	// List provider namespaces
    	Map<String, Provider> providers = subscription.providers().asMap();
    	System.out.println(String.format("Provider namespaces: %s\t", StringUtils.join(providers.keySet(), "\n\t")));
    	
    	// List providers
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ProvidersSample.java`
#### Snippet
```java
    		Provider provider = subscription.providers("microsoft.classicstorage");

    		System.out.println(String.format("Found provider: %s\n" 
    				+ "\tRegistration State: %s\n"
    				+ "\tAPI versions for resource types:",
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ProvidersSample.java`
#### Snippet
```java
    		
    		for(ResourceType t : provider.resourceTypes().values()) {
    			System.out.println(String.format("\t\t%s: %s", t.id(), StringUtils.join(t.apiVersions(), ", ")));
    		}
    		
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ProvidersSample.java`
#### Snippet
```java
    		// Get latest API version for a specific resource type
    		String resourceType = "storageAccounts";
    		System.out.println(String.format("\n\t\tLatest version for type %s: %s", resourceType, 
    			provider.resourceTypes().get(resourceType).latestApiVersion()));

```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/ProvidersSample.java`
#### Snippet
```java

    		// Get latest API version for a specific resource type - shortcut
    		System.out.println(String.format("\n\t\tLatest version for type %s: %s", resourceType, 
        		provider.resourceTypes(resourceType).latestApiVersion()));
    	}
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/NetworksSample.java`
#### Snippet
```java
		}
		
		System.out.println(String.format("Network: %s\n"
				+ "\tRegion: %s\n"
				+ "\tCIDR: %s\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/NetworksSample.java`
#### Snippet
```java
		// Create a network with multiple subnets
		networkName = "net" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating virtual network named '%s'...", networkName));
		azure.networks().define(networkName)
			.withRegion("West US")
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/NetworksSample.java`
#### Snippet
```java

		// Delete the newly created virtual network
		System.out.println(String.format("Deleting virtual network named '%s'...", network.id()));
		azure.networks().delete(network.id());

```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/NetworksSample.java`
#### Snippet
```java
		// Create network with default subnet
		networkName = "net" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating virtual network named '%s'...", networkName));
		azure.networks().define(networkName)
			.withRegion("West US")
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/NetworksSample.java`
#### Snippet
```java

		// Delete the newly created virtual network
		System.out.println(String.format("Deleting virtual network named '%s'...", network.id()));
		azure.networks().delete(network.id());
	}
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/StorageAccountsSample.java`
#### Snippet
```java
	public static void test(Azure azure) throws Exception {
		final String accountName = "store" + String.valueOf(System.currentTimeMillis());
		System.out.println(String.format("Creating account named '%s'...", accountName));
		
		// Create a new storage account
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/StorageAccountsSample.java`
#### Snippet
```java
		// Get storage account information
		StorageAccount storageAccount = azure.storageAccounts(accountName);
		System.out.println(String.format("Found storage account: %s\n"
				+ "\tAffinity group: %s\n"
				+ "\tLabel: %s\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/StorageAccountsSample.java`
#### Snippet
```java
		
		// Update storage info
		System.out.println(String.format("Updating storage account named '%s'...", accountName));

		azure.storageAccounts().update(accountName)
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/StorageAccountsSample.java`
#### Snippet
```java
		
		storageAccount = azure.storageAccounts(accountName);
		System.out.println(String.format("Updated storage account: %s\n"
				+ "\tLabel: %s\n"
				+ "\tDescription: %s\n",		
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/services/samples/StorageAccountsSample.java`
#### Snippet
```java
		
		// Delete the newly created storage account
		System.out.println(String.format("Deleting storage account named '%s'...", accountName));
		azure.storageAccounts().delete(accountName);
	}
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/SizesSample.java`
#### Snippet
```java
    	Map<String, Size> sizes = subscription.sizes().asMap("westus");
    	for(Size size : sizes.values()) {
        	System.out.println(String.format("VM size: %s\n"
        		+ "\tMax data disk count: %d\n"
        		+ "\tMemory in MB: %d\n"
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/VirtualMachinesSample.java`
#### Snippet
```java
    	// Listing all virtual machine ids in a subscription
    	Map<String, VirtualMachine> vms = subscription.virtualMachines().asMap();
    	System.out.println(String.format("Virtual machines: \n\t%s",  StringUtils.join(vms.keySet(), "\n\t")));

    	// Adding a Linux VM to the same group and VNet
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/VirtualMachinesSample.java`
#### Snippet
```java
    	// Listing vms in a specific group
    	Map<String, VirtualMachine> vmsInGroup = subscription.virtualMachines().asMap(groupName);
    	System.out.println(String.format("Virtual machines: \n\t%s", StringUtils.join(vmsInGroup.keySet(), "\n\t")));
    	
    	// Listing virtual machines as objects
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/PublicIpAddressesSample.java`
#### Snippet
```java
    	// Listing PIPs in a specific resource group
    	pips = subscription.publicIpAddresses().asMap(pipMinimal.resourceGroup());
    	System.out.println(String.format("PIP ids in group '%s': \n\t%s", 
    		pipMinimal.resourceGroup(), StringUtils.join(pips.keySet(), ",\n\t")));
    	
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/StorageAccountsSample.java`
#### Snippet
```java
    	// Listing all storage accounts
    	Map<String, StorageAccount> storageAccounts = subscription.storageAccounts().asMap();
    	System.out.println(String.format("Storage accounts ids: \n\t%s", StringUtils.join(storageAccounts.keySet(), ",\n\t")));

    	// Listing storage accounts in a specific resource group
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/StorageAccountsSample.java`
#### Snippet
```java
    	// Listing storage accounts in a specific resource group
    	storageAccounts = subscription.storageAccounts().asMap(groupName);
    	System.out.println(String.format("Storage account ids in group '%s': \n\t%s", groupName, StringUtils.join(storageAccounts.keySet(), ",\n\t")));
    	
    	// Get info about a specific storage account using its group and name
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/LoadBalancersSample.java`
#### Snippet
```java
    	// Listing all lbs
    	Map<String, LoadBalancer> lbs = subscription.loadBalancers().asMap();
    	System.out.println(String.format("Load Balancer ids: \n\t%s", StringUtils.join(lbs.keySet(), ",\n\t")));
    	
    	// Listing lbs in a specific resource group
```

### RedundantStringFormatCall
Redundant call to `format()`
in `src/com/microsoft/azure/shortcuts/resources/samples/LoadBalancersSample.java`
#### Snippet
```java
    	// Listing lbs in a specific resource group
    	lbs = subscription.loadBalancers().asMap(groupName);
    	System.out.println(String.format("Load balancer ids in group '%s': \n\t%s", groupName, StringUtils.join(lbs.keySet(), ",\n\t")));
    	
    	// Get info about a specific lb using its resource ID
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(this.azureRole.isProvisionGuestAgent() == null) ? false : this.azureRole.isProvisionGuestAgent().booleanValue()` can be simplified to 'this.azureRole.isProvisionGuestAgent()!=null \&\& this.azureRole.isProvisionGuestAgent().booleanValue()'
in `src/com/microsoft/azure/shortcuts/services/implementation/VirtualMachinesImpl.java`
#### Snippet
```java
		@Override
		public boolean hasGuestAgent() throws Exception {
			return ((this.azureRole.isProvisionGuestAgent() == null) ? false : this.azureRole.isProvisionGuestAgent().booleanValue());
		}
				
```

### SimplifiableConditionalExpression
`(config.isEnableAutomaticUpdates() != null) ? config.isEnableAutomaticUpdates().booleanValue() : false` can be simplified to 'config.isEnableAutomaticUpdates() != null \&\& config.isEnableAutomaticUpdates().booleanValue()'
in `src/com/microsoft/azure/shortcuts/services/implementation/VirtualMachinesImpl.java`
#### Snippet
```java
		public boolean autoUpdate() {
			ConfigurationSet config = ensureOSConfigurationSet();
			return (config.isEnableAutomaticUpdates() != null) ? config.isEnableAutomaticUpdates().booleanValue() : false;
		}

```

### SimplifiableConditionalExpression
`(p == null) ? false : (this.inner().getOSProfile().getWindowsConfiguration() != null)` can be simplified to 'p!=null \&\& (this.inner().getOSProfile().getWindowsConfiguration() != null)'
in `src/com/microsoft/azure/shortcuts/resources/implementation/VirtualMachineImpl.java`
#### Snippet
```java
	public boolean isWindows() {
		OSProfile p = this.inner().getOSProfile();
		return (p == null) ? false : (this.inner().getOSProfile().getWindowsConfiguration() != null);
	}
			
```

### SimplifiableConditionalExpression
`(p == null) ? false : (this.inner().getOSProfile().getLinuxConfiguration() != null)` can be simplified to 'p!=null \&\& (this.inner().getOSProfile().getLinuxConfiguration() != null)'
in `src/com/microsoft/azure/shortcuts/resources/implementation/VirtualMachineImpl.java`
#### Snippet
```java
	public boolean isLinux() {
		OSProfile p = this.inner().getOSProfile();
		return (p == null) ? false : (this.inner().getOSProfile().getLinuxConfiguration() != null);
	}
	
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/AvailabilitySetSample.java`
#### Snippet
```java
    		;
    	
    	System.out.println(output.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/PublishersSample.java`
#### Snippet
```java
		}
    	
    	System.out.println(info.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/services/samples/VirtualMachinesSample.java`
#### Snippet
```java
			
		
		System.out.println(info.toString());
	}
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworkSecurityGroupsSample.java`
#### Snippet
```java
    		;
    	
    	System.out.println(output.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworkInterfacesSample.java`
#### Snippet
```java
    	} 
    	
    	System.out.println(output.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/NetworksSample.java`
#### Snippet
```java
    	}
    	
    	System.out.println(output.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/VirtualMachinesSample.java`
#### Snippet
```java
			;
			
		System.out.println(info.toString());
    }
 }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/PublicIpAddressesSample.java`
#### Snippet
```java
    		;
    	
    	System.out.println(output.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/StorageAccountsSample.java`
#### Snippet
```java
    		;
    	
    	System.out.println(output.toString());
    }
}
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/com/microsoft/azure/shortcuts/resources/samples/LoadBalancersSample.java`
#### Snippet
```java
    		;
    	
    	System.out.println(output.toString());
    }
}
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkInterfacesImpl.java`
#### Snippet
```java
		
		// Default IP configs, creating Primary by default
		azureNetworkInterface.setIpConfigurations(new ArrayList<NetworkInterfaceIpConfiguration>(Arrays.asList(new NetworkInterfaceIpConfiguration())));
		
		// TODO Min settings
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/com/microsoft/azure/shortcuts/services/implementation/VirtualMachinesImpl.java`
#### Snippet
```java
			netConfigSet.setInputEndpoints(endpoints);
			if(this.subnet != null) {
				netConfigSet.setSubnetNames(new ArrayList<String>(Arrays.asList(this.subnet)));
			}
			
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `src/com/microsoft/azure/shortcuts/services/implementation/VirtualMachinesImpl.java`
#### Snippet
```java
				// Prepare role definition
				this.azureRole.setOSVirtualHardDisk(osDisk);
				ArrayList<Role> roles = new ArrayList<Role>(Arrays.asList(this.azureRole));

				// Create a new deployment
```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `ResourceTypeImpl` may be 'static'
in `src/com/microsoft/azure/shortcuts/resources/implementation/ProviderImpl.java`
#### Snippet
```java
	
	// Implementation of resource type
	private class ResourceTypeImpl
		extends IndexableImpl
		implements Provider.ResourceType {
```

### InnerClassMayBeStatic
Inner class `SizeImpl` may be 'static'
in `src/com/microsoft/azure/shortcuts/resources/implementation/SizesImpl.java`
#### Snippet
```java
	
	// Implementation of a Size
	private class SizeImpl
		extends IndexableImpl
		implements Size {
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkSecurityGroupImpl.java`
#### Snippet
```java
	
	
	/***********************************************************
	 * Getters
	 ***********************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkSecurityGroupImpl.java`
#### Snippet
```java
	 ***********************************************************/
	
	/**************************************************************
	 * Setters (fluent interface)
	 **************************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/LoadBalancerImpl.java`
#### Snippet
```java
	
	
	/***********************************************************
	 * Getters
	 ***********************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/LoadBalancerImpl.java`
#### Snippet
```java
	
	
	/**************************************************************
	 * Setters (fluent interface)
	 **************************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/AvailabilitySetImpl.java`
#### Snippet
```java
	
	
	/**************************************************************
	 * Setters (fluent interface)
	 **************************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/SubnetImpl.java`
#### Snippet
```java

	
	/*********************************************************
	 * Helpers
	 *********************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/PublisherImpl.java`
#### Snippet
```java


	/************************************************************
	 * Verbs
	 ************************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/services/implementation/Azure.java`
#### Snippet
```java
	
	
	/******************************************************
	 * Getters
	 ******************************************************/
```

### DanglingJavadoc
Dangling Javadoc comment
in `src/com/microsoft/azure/shortcuts/resources/implementation/NetworkSecurityRuleImpl.java`
#### Snippet
```java
	}

	/***********************************************************
	 * Getters
	 ***********************************************************/
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `configuration` initializer `null` is redundant
in `src/com/microsoft/azure/shortcuts/services/implementation/Azure.java`
#### Snippet
```java

public class Azure {
	private Configuration configuration= null;
	private ManagementClient management = null;
	private ComputeManagementClient compute = null;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/com/microsoft/azure/shortcuts/resources/Region.java`
#### Snippet
```java

/**
 * Enumeration of the Azure datacenter regions. See https://azure.microsoft.com/regions/
 */
public enum Region {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/com/microsoft/azure/shortcuts/resources/implementation/SizesImpl.java`
#### Snippet
```java

		final private VirtualMachineSize azureSize;
		final private EntitiesImpl<Subscription> collection;
		
		private SizeImpl(VirtualMachineSize azureSize, EntitiesImpl<Subscription> collection) {
```

