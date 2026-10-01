package iso2t.rovi.entity;

import iso2t.rovi.helpers.resource.Resource;
import lombok.AccessLevel;
import lombok.Getter;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import org.jspecify.annotations.NonNull;

// Geometry generated with Blockbench 5.2.1; model API adapted for Minecraft 26.3.
@SuppressWarnings("unused")
public class RoviEntity<T extends EntityRenderState> extends EntityModel<T> {

	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Resource.get("rovientity"), "main");

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart chassis;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart trackRight;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wheelRightRear;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wheelRightMiddle;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wheelRightFront;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart armRight;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart upperArmRight;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart elbowRight;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart armRightExtend;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wristRightModule;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart gripperRight;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart gripperRightOuterX;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart gripperRightInnerX;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart trackLeft;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wheelLeftRear;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wheelLeftMiddle;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wheelLeftFront;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart armLeft;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart upperArmLeft;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart elbowLeft;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart armLeftExtend;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart wristLeftModule;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart gripperLeft;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart gripperLeftOuterX;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart gripperLeftInnerX;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart head;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart screenDisplay;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart neckHinge;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart body;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart chestFront;

	@Getter(value = AccessLevel.PRIVATE)
	private final ModelPart rearModuleMount;

	public RoviEntity (ModelPart root) {
		super(root);
		this.chassis = root.getChild("Chassis");
		this.trackRight = this.chassis.getChild("Track_Right");
		this.wheelRightRear = this.trackRight.getChild("Wheel_Right_Rear");
		this.wheelRightMiddle = this.trackRight.getChild("Wheel_Right_Middle");
		this.wheelRightFront = this.trackRight.getChild("Wheel_Right_Front");
		this.armRight = this.chassis.getChild("Arm_Right");
		this.upperArmRight = this.armRight.getChild("UpperArm_Right");
		this.elbowRight = this.upperArmRight.getChild("Elbow_Right");
		this.armRightExtend = this.elbowRight.getChild("Arm_Right_Extend");
		this.wristRightModule = this.armRightExtend.getChild("Wrist_Right_Module");
		this.gripperRight = this.wristRightModule.getChild("Gripper_Right");
		this.gripperRightOuterX = this.gripperRight.getChild("Gripper_Right_OuterX");
		this.gripperRightInnerX = this.gripperRight.getChild("Gripper_Right_InnerX");
		this.trackLeft = this.chassis.getChild("Track_Left");
		this.wheelLeftRear = this.trackLeft.getChild("Wheel_Left_Rear");
		this.wheelLeftMiddle = this.trackLeft.getChild("Wheel_Left_Middle");
		this.wheelLeftFront = this.trackLeft.getChild("Wheel_Left_Front");
		this.armLeft = this.chassis.getChild("Arm_Left");
		this.upperArmLeft = this.armLeft.getChild("UpperArm_Left");
		this.elbowLeft = this.upperArmLeft.getChild("Elbow_Left");
		this.armLeftExtend = this.elbowLeft.getChild("Arm_Left_Extend");
		this.wristLeftModule = this.armLeftExtend.getChild("Wrist_Left_Module");
		this.gripperLeft = this.wristLeftModule.getChild("Gripper_Left");
		this.gripperLeftOuterX = this.gripperLeft.getChild("Gripper_Left_OuterX");
		this.gripperLeftInnerX = this.gripperLeft.getChild("Gripper_Left_InnerX");
		this.head = this.chassis.getChild("Head");
		this.screenDisplay = this.head.getChild("Screen_Display");
		this.neckHinge = this.chassis.getChild("Neck_Hinge");
		this.body = this.chassis.getChild("Body");
		this.chestFront = this.body.getChild("Chest_Front");
		this.rearModuleMount = this.body.getChild("Rear_Module_Mount");
	}

	public static LayerDefinition createBodyLayer () {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chassis = partdefinition.addOrReplaceChild("Chassis", CubeListBuilder.create().texOffs(47, 1).addBox(-3.5F, -4.0F, -4.5F, 7.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Track_Right = Chassis.addOrReplaceChild("Track_Right", CubeListBuilder.create().texOffs(81, 15).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(101, 15).addBox(-1.5F, 1.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(81, 33).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 44).addBox(-1.5F, 0.0F, -5.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -1.0F, -5.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(81, 33).addBox(-1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 44).addBox(-1.5F, 0.0F, 4.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -1.0F, 4.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offset(-5.0F, -2.0F, 0.0F));

		PartDefinition Belt_Right_Corner_1_1_r1 = Track_Right.addOrReplaceChild("Belt_Right_Corner_1_1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Belt_Right_Corner_1_neg1_r1 = Track_Right.addOrReplaceChild("Belt_Right_Corner_1_neg1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Belt_Right_Corner_neg1_1_r1 = Track_Right.addOrReplaceChild("Belt_Right_Corner_neg1_1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Belt_Right_Corner_neg1_neg1_r1 = Track_Right.addOrReplaceChild("Belt_Right_Corner_neg1_neg1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Rear = Track_Right.addOrReplaceChild("Wheel_Right_Rear", CubeListBuilder.create().texOffs(1, 33).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(13, 33).addBox(-2.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(107, 44).addBox(-2.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition Wheel_Right_Rear_Face_3_r1 = Wheel_Right_Rear.addOrReplaceChild("Wheel_Right_Rear_Face_3_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Rear_Face_2_r1 = Wheel_Right_Rear.addOrReplaceChild("Wheel_Right_Rear_Face_2_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Rear_Face_1_r1 = Wheel_Right_Rear.addOrReplaceChild("Wheel_Right_Rear_Face_1_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Middle = Track_Right.addOrReplaceChild("Wheel_Right_Middle", CubeListBuilder.create().texOffs(91, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(17, 39).addBox(-2.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(113, 44).addBox(-2.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Middle_Face_3_r1 = Wheel_Right_Middle.addOrReplaceChild("Wheel_Right_Middle_Face_3_r1", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(91, 33).addBox(0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Middle_Face_2_r1 = Wheel_Right_Middle.addOrReplaceChild("Wheel_Right_Middle_Face_2_r1", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(91, 33).addBox(0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Middle_Face_1_r1 = Wheel_Right_Middle.addOrReplaceChild("Wheel_Right_Middle_Face_1_r1", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(91, 33).addBox(0.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Front = Track_Right.addOrReplaceChild("Wheel_Right_Front", CubeListBuilder.create().texOffs(1, 33).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(13, 33).addBox(-2.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(107, 44).addBox(-2.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition Wheel_Right_Front_Face_3_r1 = Wheel_Right_Front.addOrReplaceChild("Wheel_Right_Front_Face_3_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Front_Face_2_r1 = Wheel_Right_Front.addOrReplaceChild("Wheel_Right_Front_Face_2_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Wheel_Right_Front_Face_1_r1 = Wheel_Right_Front.addOrReplaceChild("Wheel_Right_Front_Face_1_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Arm_Right = Chassis.addOrReplaceChild("Arm_Right", CubeListBuilder.create().texOffs(107, 24).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(101, 33).addBox(-1.75F, -1.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)).texOffs(109, 33).addBox(-1.875F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(95, 44).addBox(-2.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(-4.0F, -6.5F, 0.5F));

		PartDefinition Shoulder_Cap_Right_3_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cap_Right_3_r1", CubeListBuilder.create().texOffs(109, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(107, 24).addBox(0.375F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.375F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cap_Right_2_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cap_Right_2_r1", CubeListBuilder.create().texOffs(109, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(107, 24).addBox(0.375F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.375F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cap_Right_1_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cap_Right_1_r1", CubeListBuilder.create().texOffs(109, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(107, 24).addBox(0.375F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-1.375F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Right_7_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cyan_Ring_Right_7_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-1.25F, -0.9192F, -0.9192F, -5.4978F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Right_6_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cyan_Ring_Right_6_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-1.25F, 0.0F, -1.3F, -4.7124F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Right_5_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cyan_Ring_Right_5_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-1.25F, 0.9192F, -0.9192F, -3.927F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Right_4_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cyan_Ring_Right_4_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-1.25F, 1.3F, 0.0F, -3.1416F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Right_3_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cyan_Ring_Right_3_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-1.25F, 0.9192F, 0.9192F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Right_2_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cyan_Ring_Right_2_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-1.25F, 0.0F, 1.3F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Right_1_r1 = Arm_Right.addOrReplaceChild("Shoulder_Cyan_Ring_Right_1_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-1.25F, -0.9192F, 0.9192F, -0.7854F, 0.0F, 0.0F));

		PartDefinition UpperArm_Right = Arm_Right.addOrReplaceChild("UpperArm_Right", CubeListBuilder.create().texOffs(25, 44).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 33).addBox(-2.5F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2094F));

		PartDefinition Elbow_Right = UpperArm_Right.addOrReplaceChild("Elbow_Right", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(67, 24).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(1, 39).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(-2.5F, 0.5F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition Elbow_Collar_Right_3_r1 = Elbow_Right.addOrReplaceChild("Elbow_Collar_Right_3_r1", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Elbow_Collar_Right_2_r1 = Elbow_Right.addOrReplaceChild("Elbow_Collar_Right_2_r1", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Elbow_Collar_Right_1_r1 = Elbow_Right.addOrReplaceChild("Elbow_Collar_Right_1_r1", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Arm_Right_Extend = Elbow_Right.addOrReplaceChild("Arm_Right_Extend", CubeListBuilder.create().texOffs(23, 24).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.125F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Wrist_Right_Module = Arm_Right_Extend.addOrReplaceChild("Wrist_Right_Module", CubeListBuilder.create().texOffs(9, 39).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.5F));

		PartDefinition Gripper_Right = Wrist_Right_Module.addOrReplaceChild("Gripper_Right", CubeListBuilder.create().texOffs(71, 33).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 39).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.375F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Gripper_Right_OuterX = Gripper_Right.addOrReplaceChild("Gripper_Right_OuterX", CubeListBuilder.create().texOffs(31, 33).addBox(-0.5F, -1.0F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0625F)).texOffs(101, 44).addBox(-0.375F, -0.5F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offset(-1.0F, 0.0F, -0.5F));

		PartDefinition Gripper_Right_InnerX = Gripper_Right.addOrReplaceChild("Gripper_Right_InnerX", CubeListBuilder.create().texOffs(31, 33).addBox(-0.5F, -1.0F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0625F)).texOffs(101, 44).addBox(-0.625F, -0.5F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offset(1.0F, 0.0F, -0.5F));

		PartDefinition Track_Left = Chassis.addOrReplaceChild("Track_Left", CubeListBuilder.create().texOffs(81, 15).addBox(-1.5F, -2.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(101, 15).addBox(-1.5F, 1.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(81, 33).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 44).addBox(-1.5F, 0.0F, -5.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -1.0F, -5.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(81, 33).addBox(-1.5F, -1.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 44).addBox(-1.5F, 0.0F, 4.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -1.0F, 4.125F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, -2.25F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)).texOffs(35, 44).addBox(-1.5F, 1.125F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offset(5.0F, -2.0F, 0.0F));

		PartDefinition Belt_Left_Corner_1_1_r1 = Track_Left.addOrReplaceChild("Belt_Left_Corner_1_1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Belt_Left_Corner_1_neg1_r1 = Track_Left.addOrReplaceChild("Belt_Left_Corner_1_neg1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Belt_Left_Corner_neg1_1_r1 = Track_Left.addOrReplaceChild("Belt_Left_Corner_neg1_1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Belt_Left_Corner_neg1_neg1_r1 = Track_Left.addOrReplaceChild("Belt_Left_Corner_neg1_neg1_r1", CubeListBuilder.create().texOffs(39, 33).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Rear = Track_Left.addOrReplaceChild("Wheel_Left_Rear", CubeListBuilder.create().texOffs(1, 33).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(13, 33).addBox(1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(107, 44).addBox(1.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition Wheel_Left_Rear_Face_3_r1 = Wheel_Left_Rear.addOrReplaceChild("Wheel_Left_Rear_Face_3_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Rear_Face_2_r1 = Wheel_Left_Rear.addOrReplaceChild("Wheel_Left_Rear_Face_2_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Rear_Face_1_r1 = Wheel_Left_Rear.addOrReplaceChild("Wheel_Left_Rear_Face_1_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Middle = Track_Left.addOrReplaceChild("Wheel_Left_Middle", CubeListBuilder.create().texOffs(91, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(17, 39).addBox(1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(113, 44).addBox(1.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Middle_Face_3_r1 = Wheel_Left_Middle.addOrReplaceChild("Wheel_Left_Middle_Face_3_r1", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(91, 33).addBox(-2.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Middle_Face_2_r1 = Wheel_Left_Middle.addOrReplaceChild("Wheel_Left_Middle_Face_2_r1", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(91, 33).addBox(-2.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Middle_Face_1_r1 = Wheel_Left_Middle.addOrReplaceChild("Wheel_Left_Middle_Face_1_r1", CubeListBuilder.create().texOffs(17, 39).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(91, 33).addBox(-2.5F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Front = Track_Left.addOrReplaceChild("Wheel_Left_Front", CubeListBuilder.create().texOffs(1, 33).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(13, 33).addBox(1.0F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(107, 44).addBox(1.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition Wheel_Left_Front_Face_3_r1 = Wheel_Left_Front.addOrReplaceChild("Wheel_Left_Front_Face_3_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Front_Face_2_r1 = Wheel_Left_Front.addOrReplaceChild("Wheel_Left_Front_Face_2_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Wheel_Left_Front_Face_1_r1 = Wheel_Left_Front.addOrReplaceChild("Wheel_Left_Front_Face_1_r1", CubeListBuilder.create().texOffs(13, 33).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(1, 33).addBox(-2.5F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Arm_Left = Chassis.addOrReplaceChild("Arm_Left", CubeListBuilder.create().texOffs(107, 24).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)).texOffs(101, 33).addBox(0.75F, -1.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)).texOffs(109, 33).addBox(0.875F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(95, 44).addBox(1.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(4.0F, -6.5F, 0.5F));

		PartDefinition Shoulder_Cap_Left_3_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cap_Left_3_r1", CubeListBuilder.create().texOffs(109, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(107, 24).addBox(-2.375F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.375F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cap_Left_2_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cap_Left_2_r1", CubeListBuilder.create().texOffs(109, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(107, 24).addBox(-2.375F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.375F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cap_Left_1_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cap_Left_1_r1", CubeListBuilder.create().texOffs(109, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(107, 24).addBox(-2.375F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(1.375F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Left_7_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cyan_Ring_Left_7_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(1.25F, -0.9192F, -0.9192F, -5.4978F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Left_6_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cyan_Ring_Left_6_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(1.25F, 0.0F, -1.3F, -4.7124F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Left_5_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cyan_Ring_Left_5_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(1.25F, 0.9192F, -0.9192F, -3.927F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Left_4_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cyan_Ring_Left_4_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(1.25F, 1.3F, 0.0F, -3.1416F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Left_3_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cyan_Ring_Left_3_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(1.25F, 0.9192F, 0.9192F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Left_2_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cyan_Ring_Left_2_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(1.25F, 0.0F, 1.3F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Shoulder_Cyan_Ring_Left_1_r1 = Arm_Left.addOrReplaceChild("Shoulder_Cyan_Ring_Left_1_r1", CubeListBuilder.create().texOffs(101, 33).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(1.25F, -0.9192F, 0.9192F, -0.7854F, 0.0F, 0.0F));

		PartDefinition UpperArm_Left = Arm_Left.addOrReplaceChild("UpperArm_Left", CubeListBuilder.create().texOffs(25, 44).addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 33).addBox(0.5F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2094F));

		PartDefinition Elbow_Left = UpperArm_Left.addOrReplaceChild("Elbow_Left", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)).texOffs(67, 24).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(1, 39).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(2.5F, 0.5F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition Elbow_Collar_Left_3_r1 = Elbow_Left.addOrReplaceChild("Elbow_Collar_Left_3_r1", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition Elbow_Collar_Left_2_r1 = Elbow_Left.addOrReplaceChild("Elbow_Collar_Left_2_r1", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition Elbow_Collar_Left_1_r1 = Elbow_Left.addOrReplaceChild("Elbow_Collar_Left_1_r1", CubeListBuilder.create().texOffs(61, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1464F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Arm_Left_Extend = Elbow_Left.addOrReplaceChild("Arm_Left_Extend", CubeListBuilder.create().texOffs(23, 24).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.125F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Wrist_Left_Module = Arm_Left_Extend.addOrReplaceChild("Wrist_Left_Module", CubeListBuilder.create().texOffs(9, 39).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.5F));

		PartDefinition Gripper_Left = Wrist_Left_Module.addOrReplaceChild("Gripper_Left", CubeListBuilder.create().texOffs(71, 33).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 39).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.375F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Gripper_Left_OuterX = Gripper_Left.addOrReplaceChild("Gripper_Left_OuterX", CubeListBuilder.create().texOffs(31, 33).addBox(-0.5F, -1.0F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0625F)).texOffs(101, 44).addBox(-0.375F, -0.5F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offset(-1.0F, 0.0F, -0.5F));

		PartDefinition Gripper_Left_InnerX = Gripper_Left.addOrReplaceChild("Gripper_Left_InnerX", CubeListBuilder.create().texOffs(31, 33).addBox(-0.5F, -1.0F, -1.875F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.0625F)).texOffs(101, 44).addBox(-0.625F, -0.5F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0625F)), PartPose.offset(1.0F, 0.0F, -0.5F));

		PartDefinition Head = Chassis.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(1, 1).addBox(-4.0F, -6.5F, -3.5F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1, 15).addBox(-4.0F, -7.5F, -3.5F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 15).addBox(-4.0F, -0.5F, -3.5F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 1).addBox(4.0F, -6.5F, -3.5F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 1).addBox(-5.0F, -6.5F, -3.5F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(105, 1).addBox(-4.0F, -6.5F, 2.5F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 39).addBox(-4.0F, -7.5F, -4.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 39).addBox(-4.0F, -0.5F, -4.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(121, 15).addBox(4.0F, -6.5F, -4.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(121, 15).addBox(-5.0F, -6.5F, -4.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 39).addBox(-4.0F, -6.75F, -4.5625F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(91, 39).addBox(-4.0F, -1.25F, -4.5625F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(17, 24).addBox(3.25F, -6.5F, -4.5625F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(17, 24).addBox(-4.25F, -6.5F, -4.5625F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(55, 24).addBox(4.4375F, -2.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.375F)).texOffs(55, 24).addBox(4.4375F, -3.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.375F)).texOffs(55, 24).addBox(4.4375F, -4.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.375F)).texOffs(55, 24).addBox(-5.4375F, -2.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.375F)).texOffs(55, 24).addBox(-5.4375F, -3.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.375F)).texOffs(55, 24).addBox(-5.4375F, -4.5F, -1.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.375F)).texOffs(89, 44).addBox(2.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)).texOffs(89, 44).addBox(-3.0F, -8.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)).texOffs(1, 44).addBox(-2.5F, -8.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(45, 44).addBox(0.5F, -3.0F, 3.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(45, 44).addBox(0.5F, -4.0F, 3.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(45, 44).addBox(0.5F, -5.0F, 3.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(45, 44).addBox(-3.5F, -3.0F, 3.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(45, 44).addBox(-3.5F, -4.0F, 3.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(45, 44).addBox(-3.5F, -5.0F, 3.0625F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition Bezel_Corner_1_1_r1 = Head.addOrReplaceChild("Bezel_Corner_1_1_r1", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2071F)).texOffs(1, 24).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-4.0F, -6.5F, -4.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Bezel_Corner_1_neg1_r1 = Head.addOrReplaceChild("Bezel_Corner_1_neg1_r1", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2071F)).texOffs(1, 24).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(-4.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Bezel_Corner_neg1_1_r1 = Head.addOrReplaceChild("Bezel_Corner_neg1_1_r1", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2071F)).texOffs(1, 24).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(4.0F, -6.5F, -4.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Bezel_Corner_neg1_neg1_r1 = Head.addOrReplaceChild("Bezel_Corner_neg1_neg1_r1", CubeListBuilder.create().texOffs(83, 44).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2071F)).texOffs(1, 24).addBox(-0.5F, -0.5F, 0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.2071F)), PartPose.offsetAndRotation(4.0F, -0.5F, -4.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Screen_Display = Head.addOrReplaceChild("Screen_Display", CubeListBuilder.create().texOffs(61, 15).addBox(-4.0F, -3.0F, 0.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, -4.25F));

		PartDefinition Neck_Hinge = Chassis.addOrReplaceChild("Neck_Hinge", CubeListBuilder.create().texOffs(119, 24).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(111, 39).addBox(-3.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition Body = Chassis.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(81, 1).addBox(-3.0F, -1.5F, -2.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 24).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, 0.0F));

		PartDefinition Chest_Front = Body.addOrReplaceChild("Chest_Front", CubeListBuilder.create().texOffs(79, 24).addBox(-3.0F, -1.5F, -0.625F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 44).addBox(-1.5F, -0.625F, -0.9375F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F)).texOffs(55, 44).addBox(-1.0F, -0.75F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(63, 44).addBox(-1.5F, 0.375F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(63, 44).addBox(-1.5F, -0.125F, -1.125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.5F, 0.2094F, 0.0F, 0.0F));

		PartDefinition Rear_Module_Mount = Body.addOrReplaceChild("Rear_Module_Mount", CubeListBuilder.create().texOffs(95, 24).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 33).addBox(-1.5F, -1.0F, -0.125F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.125F)).texOffs(71, 44).addBox(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(71, 44).addBox(0.0F, -1.0F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(77, 44).addBox(-1.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)).texOffs(77, 44).addBox(-1.0F, -1.0F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.375F)), PartPose.offset(0.0F, 0.0F, 2.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim (@NonNull T state) {
		super.setupAnim(state);
	}
}
