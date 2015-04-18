package com.scalaAsm.x86.Instructions

import com.scalaAsm.x86.Instructions.General._
import com.scalaAsm.x86.Instructions.System._
import com.scalaAsm.x86.Instructions.x87._

object instructionMap {
  val instMap = Map[Int, Set[x86Instruction]](
    0 -> Set(STR.STR_2, SLDT.SLDT_1, LTR.LTR_0, JMPE.JMPE_0, STR.STR_3, VERR.VERR_0, SLDT.SLDT_3, ADD.ADD_9, LLDT.LLDT_0, VERW.VERW_0, SLDT.SLDT_2, STR.STR_1, SLDT.SLDT_0, STR.STR_0),
    1 -> Set(INVLPG.INVLPG_0, SMSW.SMSW_3, XSETBV.XSETBV_0, LMSW.LMSW_0, RDTSCP.RDTSCP_0, ADD.ADD_7, SMSW.SMSW_1, ADD.ADD_12, SMSW.SMSW_0, ADD.ADD_17, SMSW.SMSW_2, SWAPGS.SWAPGS_0, XGETBV.XGETBV_0),
    2 -> Set(ADD.ADD_10, LAR.LAR_1, LAR.LAR_4, LAR.LAR_2, LAR.LAR_3, LAR.LAR_0, LAR.LAR_5),
    3 -> Set(LSL.LSL_2, LSL.LSL_1, ADD.ADD_8, ADD.ADD_16, LSL.LSL_0, ADD.ADD_4, LSL.LSL_4, LSL.LSL_5, LSL.LSL_3),
    4 -> Set(ADD.ADD_3),
    5 -> Set(LOADALL.LOADALL_0, SYSCALL.SYSCALL_0, ADD.ADD_11, ADD.ADD_1),
    6 -> Set(PUSH.PUSH_6, CLTS.CLTS_0),
    7 -> Set(SYSRET.SYSRET_0, POP.POP_4),
    8 -> Set(INVD.INVD_0, OR.OR_9),
    9 -> Set(OR.OR_7, OR.OR_12, WBINVD.WBINVD_0, OR.OR_17),
    10 -> Set(OR.OR_10),
    11 -> Set(OR.OR_8, OR.OR_16, OR.OR_4, UD2.UD2_0),
    12 -> Set(OR.OR_3),
    13 -> Set(OR.OR_1, NOP.NOP_2, OR.OR_11, NOP.NOP_1),
    16 -> Set(ADC.ADC_9),
    17 -> Set(ADC.ADC_17, ADC.ADC_7, ADC.ADC_12),
    18 -> Set(ADC.ADC_10),
    19 -> Set(ADC.ADC_8, ADC.ADC_16, ADC.ADC_4),
    20 -> Set(ADC.ADC_3),
    21 -> Set(ADC.ADC_11, ADC.ADC_1),
    24 -> Set(HINT_NOP.HINT_NOP_1, SBB.SBB_9, HINT_NOP.HINT_NOP_0),
    25 -> Set(SBB.SBB_7, SBB.SBB_12, SBB.SBB_17),
    26 -> Set(SBB.SBB_10),
    27 -> Set(SBB.SBB_4, SBB.SBB_8, SBB.SBB_16),
    28 -> Set(SBB.SBB_3),
    29 -> Set(SBB.SBB_11, SBB.SBB_1),
    32 -> Set(AND.AND_9),
    33 -> Set(AND.AND_12, AND.AND_17, AND.AND_7),
    34 -> Set(AND.AND_10),
    35 -> Set(AND.AND_8, AND.AND_4, AND.AND_16),
    36 -> Set(AND.AND_3),
    37 -> Set(AND.AND_11, AND.AND_1),
    39 -> Set(DAA.DAA_0),
    40 -> Set(SUB.SUB_9),
    41 -> Set(SUB.SUB_12, SUB.SUB_17, SUB.SUB_7),
    42 -> Set(SUB.SUB_10),
    43 -> Set(SUB.SUB_8, SUB.SUB_4, SUB.SUB_16),
    44 -> Set(SUB.SUB_3),
    45 -> Set(SUB.SUB_11, SUB.SUB_1),
    47 -> Set(DAS.DAS_0),
    48 -> Set(WRMSR.WRMSR_0, XOR.XOR_9),
    49 -> Set(RDTSC.RDTSC_0, XOR.XOR_12, XOR.XOR_17, XOR.XOR_7),
    50 -> Set(RDMSR.RDMSR_0, XOR.XOR_10),
    51 -> Set(RDPMC.RDPMC_0, XOR.XOR_8, XOR.XOR_4, XOR.XOR_16),
    52 -> Set(XOR.XOR_3, SYSENTER.SYSENTER_0),
    53 -> Set(SYSEXIT.SYSEXIT_0, XOR.XOR_11, XOR.XOR_1),
    55 -> Set(AAA.AAA_0),
    56 -> Set(MOVBE.MOVBE_2, MOVBE.MOVBE_3, MOVBE.MOVBE_0, MOVBE.MOVBE_4, CMP.CMP_9, MOVBE.MOVBE_1, MOVBE.MOVBE_5),
    57 -> Set(CMP.CMP_12, CMP.CMP_7, CMP.CMP_17),
    58 -> Set(CMP.CMP_10),
    59 -> Set(CMP.CMP_8, CMP.CMP_4, CMP.CMP_16),
    60 -> Set(CMP.CMP_3),
    61 -> Set(CMP.CMP_1, CMP.CMP_11),
    63 -> Set(AAS.AAS_0),
    64 -> Set(CMOVO.CMOVO_2, CMOVO.CMOVO_0, CMOVO.CMOVO_1, INC.INC_3, INC.INC_4),
    65 -> Set(CMOVNO.CMOVNO_0, CMOVNO.CMOVNO_2, CMOVNO.CMOVNO_1),
    66 -> Set(CMOVB.CMOVB_1, CMOVC.CMOVC_2, CMOVC.CMOVC_1, CMOVB.CMOVB_0, CMOVNAE.CMOVNAE_0, CMOVNAE.CMOVNAE_1, CMOVC.CMOVC_0, CMOVB.CMOVB_2, CMOVNAE.CMOVNAE_2),
    67 -> Set(CMOVAE.CMOVAE_2, CMOVNB.CMOVNB_1, CMOVNB.CMOVNB_2, CMOVAE.CMOVAE_0, CMOVNC.CMOVNC_0, CMOVNC.CMOVNC_2, CMOVNC.CMOVNC_1, CMOVNB.CMOVNB_0, CMOVAE.CMOVAE_1),
    68 -> Set(CMOVZ.CMOVZ_2, CMOVE.CMOVE_1, CMOVE.CMOVE_0, CMOVZ.CMOVZ_0, CMOVE.CMOVE_2, CMOVZ.CMOVZ_1),
    69 -> Set(CMOVNZ.CMOVNZ_1, CMOVNE.CMOVNE_2, CMOVNE.CMOVNE_1, CMOVNZ.CMOVNZ_2, CMOVNZ.CMOVNZ_0, CMOVNE.CMOVNE_0),
    70 -> Set(CMOVNA.CMOVNA_0, CMOVNA.CMOVNA_2, CMOVBE.CMOVBE_0, CMOVBE.CMOVBE_1, CMOVNA.CMOVNA_1, CMOVBE.CMOVBE_2),
    71 -> Set(CMOVNBE.CMOVNBE_0, CMOVA.CMOVA_0, CMOVNBE.CMOVNBE_2, CMOVNBE.CMOVNBE_1, CMOVA.CMOVA_1, CMOVA.CMOVA_2),
    72 -> Set(DEC.DEC_4, CMOVS.CMOVS_2, CMOVS.CMOVS_1, DEC.DEC_3, CMOVS.CMOVS_0),
    73 -> Set(CMOVNS.CMOVNS_2, CMOVNS.CMOVNS_1, CMOVNS.CMOVNS_0),
    74 -> Set(CMOVP.CMOVP_2, CMOVPE.CMOVPE_1, CMOVPE.CMOVPE_2, CMOVP.CMOVP_1, CMOVPE.CMOVPE_0, CMOVP.CMOVP_0),
    75 -> Set(CMOVNP.CMOVNP_2, CMOVPO.CMOVPO_2, CMOVPO.CMOVPO_0, CMOVNP.CMOVNP_0, CMOVPO.CMOVPO_1, CMOVNP.CMOVNP_1),
    76 -> Set(CMOVL.CMOVL_2, CMOVNGE.CMOVNGE_0, CMOVL.CMOVL_1, CMOVNGE.CMOVNGE_2, CMOVL.CMOVL_0, CMOVNGE.CMOVNGE_1),
    77 -> Set(CMOVGE.CMOVGE_0, CMOVGE.CMOVGE_2, CMOVNL.CMOVNL_2, CMOVNL.CMOVNL_1, CMOVGE.CMOVGE_1, CMOVNL.CMOVNL_0),
    78 -> Set(CMOVNG.CMOVNG_1, CMOVNG.CMOVNG_0, CMOVLE.CMOVLE_0, CMOVNG.CMOVNG_2, CMOVLE.CMOVLE_2, CMOVLE.CMOVLE_1),
    79 -> Set(CMOVNLE.CMOVNLE_0, CMOVG.CMOVG_1, CMOVNLE.CMOVNLE_2, CMOVNLE.CMOVNLE_1, CMOVG.CMOVG_0, CMOVG.CMOVG_2),
    80 -> Set(PUSH.PUSH_7, PUSH.PUSH_0, PUSH.PUSH_5),
    88 -> Set(POP.POP_0, POP.POP_3, POP.POP_5),
    96 -> Set(PUSHAD.PUSHAD_0, PUSHA.PUSHA_0),
    97 -> Set(POPAD.POPAD_0, POPA.POPA_0),
    98 -> Set(BOUND.BOUND_1, BOUND.BOUND_0),
    99 -> Set(MOVSXD.MOVSXD_0, MOVSXD.MOVSXD_1, ARPL.ARPL_0),
    104 -> Set(PUSH.PUSH_9, PUSH.PUSH_2),
    106 -> Set(PUSH.PUSH_3),
    108 -> Set(INSB.INSB_0, INS.INS_0),
    109 -> Set(INSD.INSD_0, INSW.INSW_0),
    110 -> Set(OUTSB.OUTSB_0, OUTS.OUTS_0),
    111 -> Set(OUTSD.OUTSD_0, OUTSW.OUTSW_0),
    112 -> Set(JO.JO_0),
    113 -> Set(JNO.JNO_0),
    114 -> Set(JC.JC_0, JB.JB_0, JNAE.JNAE_0),
    115 -> Set(JAE.JAE_0, JNB.JNB_0, JNC.JNC_0),
    116 -> Set(JZ.JZ_0, JE.JE_0),
    117 -> Set(JNZ.JNZ_0, JNE.JNE_0),
    118 -> Set(JBE.JBE_0, JNA.JNA_0),
    119 -> Set(EMMS.EMMS_0, JA.JA_0, JNBE.JNBE_0),
    120 -> Set(JS.JS_0),
    121 -> Set(JNS.JNS_0),
    122 -> Set(JP.JP_0, JPE.JPE_0),
    123 -> Set(JNP.JNP_0, JPO.JPO_0),
    124 -> Set(JNGE.JNGE_0, JL.JL_0),
    125 -> Set(JGE.JGE_0, JNL.JNL_0),
    126 -> Set(JNG.JNG_0, JLE.JLE_0),
    127 -> Set(JNLE.JNLE_0, JG.JG_0),
    128 -> Set(JO.JO_2, ADC.ADC_6, XOR.XOR_6, AND.AND_6, OR.OR_6, JO.JO_1, CMP.CMP_6, SBB.SBB_6, SUB.SUB_6, ADD.ADD_6),
    129 -> Set(AND.AND_13, SUB.SUB_14, XOR.XOR_13, AND.AND_5, OR.OR_13, CMP.CMP_13, ADD.ADD_13, JNO.JNO_2, CMP.CMP_5, XOR.XOR_5, SUB.SUB_13, OR.OR_5, SUB.SUB_5, XOR.XOR_14, CMP.CMP_14, ADC.ADC_5, OR.OR_14, ADC.ADC_14, ADD.ADD_5, SBB.SBB_14, JNO.JNO_1, ADC.ADC_13, AND.AND_14, SBB.SBB_13, SBB.SBB_5, ADD.ADD_14),
    130 -> Set(JC.JC_1, JNAE.JNAE_2, JB.JB_1, JNAE.JNAE_1, JB.JB_2, JC.JC_2),
    131 -> Set(JNB.JNB_1, JAE.JAE_1, SUB.SUB_0, JNC.JNC_2, SUB.SUB_15, ADC.ADC_15, OR.OR_0, ADD.ADD_2, XOR.XOR_2, AND.AND_0, SBB.SBB_15, JNC.JNC_1, AND.AND_2, JNB.JNB_2, ADC.ADC_2, OR.OR_15, ADC.ADC_0, CMP.CMP_15, SBB.SBB_2, XOR.XOR_0, AND.AND_15, ADD.ADD_15, CMP.CMP_2, XOR.XOR_15, OR.OR_2, ADD.ADD_0, JAE.JAE_2, SUB.SUB_2, CMP.CMP_0, SBB.SBB_0),
    132 -> Set(JZ.JZ_1, TEST.TEST_6, JE.JE_2, JZ.JZ_2, JE.JE_1),
    133 -> Set(TEST.TEST_8, JNZ.JNZ_2, JNZ.JNZ_1, JNE.JNE_1, JNE.JNE_2, TEST.TEST_5, TEST.TEST_10),
    134 -> Set(JNA.JNA_2, JBE.JBE_1, JNA.JNA_1, JBE.JBE_2, XCHG.XCHG_5),
    135 -> Set(XCHG.XCHG_6, JA.JA_1, JNBE.JNBE_1, JNBE.JNBE_2, XCHG.XCHG_4, JA.JA_2, XCHG.XCHG_1),
    136 -> Set(JS.JS_2, MOV.MOV_17, JS.JS_1),
    137 -> Set(JNS.JNS_2, MOV.MOV_20, MOV.MOV_24, MOV.MOV_9, JNS.JNS_1),
    138 -> Set(MOV.MOV_18, JPE.JPE_1, JP.JP_2, JPE.JPE_2, JP.JP_1),
    139 -> Set(MOV.MOV_2, MOV.MOV_11, JNP.JNP_2, MOV.MOV_23, JPO.JPO_1, JPO.JPO_2, JNP.JNP_1),
    140 -> Set(JL.JL_1, MOV.MOV_14, MOV.MOV_16, JL.JL_2, MOV.MOV_13, JNGE.JNGE_1, JNGE.JNGE_2, MOV.MOV_19),
    141 -> Set(LEA.LEA_0, JGE.JGE_1, LEA.LEA_1, JNL.JNL_1, LEA.LEA_2, JNL.JNL_2, JGE.JGE_2),
    142 -> Set(JNG.JNG_1, JLE.JLE_1, JNG.JNG_2, JLE.JLE_2, MOV.MOV_10),
    143 -> Set(POP.POP_1, JG.JG_1, JG.JG_2, JNLE.JNLE_2, POP.POP_2, JNLE.JNLE_1, POP.POP_6),
    144 -> Set(XCHG.XCHG_0, XCHG.XCHG_2, XCHG.XCHG_3, NOP.NOP_0, SETO.SETO_0),
    145 -> Set(SETNO.SETNO_0),
    146 -> Set(SETB.SETB_0, SETNAE.SETNAE_0, SETC.SETC_0),
    147 -> Set(SETNB.SETNB_0, SETNC.SETNC_0, SETAE.SETAE_0),
    148 -> Set(SETZ.SETZ_0, SETE.SETE_0),
    149 -> Set(SETNE.SETNE_0, SETNZ.SETNZ_0),
    150 -> Set(SETNA.SETNA_0, SETBE.SETBE_0),
    151 -> Set(SETNBE.SETNBE_0, SETA.SETA_0),
    152 -> Set(CDQE.CDQE_0, SETS.SETS_0, CBW.CBW_0, CWDE.CWDE_0),
    153 -> Set(SETNS.SETNS_0, CQO.CQO_0, CDQ.CDQ_0, CWD.CWD_0),
    154 -> Set(SETPE.SETPE_0, SETP.SETP_0),
    155 -> Set(WAIT.WAIT_0, FWAIT.FWAIT_0, SETNP.SETNP_0, SETPO.SETPO_0),
    156 -> Set(SETNGE.SETNGE_0, PUSHF.PUSHF_0, PUSHFD.PUSHFD_0, SETL.SETL_0, PUSHFQ.PUSHFQ_0),
    157 -> Set(SETGE.SETGE_0, POPFQ.POPFQ_0, POPF.POPF_0, SETNL.SETNL_0, POPFD.POPFD_0),
    158 -> Set(SETLE.SETLE_0, SETNG.SETNG_0, SAHF.SAHF_0),
    159 -> Set(LAHF.LAHF_0, SETG.SETG_0, SETNLE.SETNLE_0),
    160 -> Set(MOV.MOV_7),
    161 -> Set(MOV.MOV_4, MOV.MOV_15, MOV.MOV_8),
    162 -> Set(CPUID.CPUID_0),
    163 -> Set(BT.BT_3, BT.BT_2, BT.BT_5),
    164 -> Set(MOVSB.MOVSB_0, MOVS.MOVS_0),
    165 -> Set(MOVSQ.MOVSQ_0, MOVSD.MOVSD_0, SHLD.SHLD_2, SHLD.SHLD_1, MOVSW.MOVSW_0, SHLD.SHLD_0),
    166 -> Set(CMPSB.CMPSB_0, CMPS.CMPS_0),
    167 -> Set(CMPSD.CMPSD_0, CMPSQ.CMPSQ_0, CMPSW.CMPSW_0),
    168 -> Set(TEST.TEST_2),
    169 -> Set(TEST.TEST_7, TEST.TEST_1),
    170 -> Set(STOS.STOS_0, STOSB.STOSB_0, RSM.RSM_0),
    171 -> Set(STOSW.STOSW_0, STOSQ.STOSQ_0, BTS.BTS_2, STOSD.STOSD_0, BTS.BTS_5, BTS.BTS_3),
    172 -> Set(LODS.LODS_0, LODSB.LODSB_0),
    173 -> Set(SHRD.SHRD_2, SHRD.SHRD_1, LODSQ.LODSQ_0, SHRD.SHRD_0, LODSW.LODSW_0, LODSD.LODSD_0),
    174 -> Set(SCASB.SCASB_0, XRSTOR.XRSTOR_0, XSAVE.XSAVE_0, SCAS.SCAS_0),
    175 -> Set(IMUL.IMUL_2, SCASQ.SCASQ_0, IMUL.IMUL_6, SCASW.SCASW_0, IMUL.IMUL_4, SCASD.SCASD_0),
    176 -> Set(CMPXCHG.CMPXCHG_0, MOV.MOV_0),
    177 -> Set(CMPXCHG.CMPXCHG_3, CMPXCHG.CMPXCHG_2, CMPXCHG.CMPXCHG_1),
    178 -> Set(LSS.LSS_1, LSS.LSS_0, LSS.LSS_2),
    179 -> Set(BTR.BTR_3, BTR.BTR_2, BTR.BTR_5),
    180 -> Set(LFS.LFS_0, LFS.LFS_2, LFS.LFS_1),
    181 -> Set(LGS.LGS_1, LGS.LGS_0, LGS.LGS_2),
    182 -> Set(MOVZX.MOVZX_0, MOVZX.MOVZX_3, MOVZX.MOVZX_5),
    183 -> Set(MOVZX.MOVZX_1, MOVZX.MOVZX_4, MOVZX.MOVZX_2),
    184 -> Set(MOV.MOV_1, POPCNT.POPCNT_1, POPCNT.POPCNT_2, POPCNT.POPCNT_0, MOV.MOV_3, MOV.MOV_12),
    186 -> Set(BTS.BTS_0, BTR.BTR_0, BTR.BTR_4, BT.BT_0, BTS.BTS_4, BTC.BTC_1, BTR.BTR_1, BTS.BTS_1, BTC.BTC_0, BT.BT_4, BTC.BTC_4, BT.BT_1),
    187 -> Set(BTC.BTC_3, BTC.BTC_2, BTC.BTC_5),
    188 -> Set(BSF.BSF_2, BSF.BSF_1, BSF.BSF_0),
    189 -> Set(BSR.BSR_0, BSR.BSR_2, BSR.BSR_1),
    190 -> Set(MOVSX.MOVSX_0, MOVSX.MOVSX_3, MOVSX.MOVSX_5),
    191 -> Set(MOVSX.MOVSX_2, MOVSX.MOVSX_1, MOVSX.MOVSX_4),
    192 -> Set(SHR.SHR_5, SAR.SAR_5, SAL.SAL_5, SHL.SHL_5, ROL.ROL_5, XADD.XADD_0, ROR.ROR_5, RCL.RCL_5, RCR.RCR_5),
    193 -> Set(RCL.RCL_7, SAL.SAL_0, ROR.ROR_7, RCL.RCL_3, ROL.ROL_0, RCR.RCR_3, XADD.XADD_2, ROR.ROR_0, SAR.SAR_0, SHR.SHR_3, SAR.SAR_7, SHL.SHL_7, SHL.SHL_0, RCL.RCL_0, RCR.RCR_7, SAR.SAR_3, SAL.SAL_3, RCR.RCR_0, SAL.SAL_7, XADD.XADD_1, SHL.SHL_3, XADD.XADD_3, SHR.SHR_0, ROL.ROL_7, ROR.ROR_3, ROL.ROL_3, SHR.SHR_7),
    194 -> Set(RETN.RETN_0),
    195 -> Set(RETN.RETN_1),
    196 -> Set(LES.LES_1, LES.LES_0),
    197 -> Set(LDS.LDS_1, LDS.LDS_0),
    198 -> Set(MOV.MOV_6),
    199 -> Set(MOV.MOV_22, MOV.MOV_5, CMPXCHG8B.CMPXCHG8B_0, CMPXCHG16B.CMPXCHG16B_0, MOV.MOV_21),
    200 -> Set(BSWAP.BSWAP_0, BSWAP.BSWAP_2, ENTER.ENTER_0, BSWAP.BSWAP_1),
    201 -> Set(LEAVE.LEAVE_0),
    202 -> Set(RETF.RETF_0),
    203 -> Set(RETF.RETF_1),
    205 -> Set(INT.INT_0),
    206 -> Set(INTO.INTO_0),
    207 -> Set(IRET.IRET_0, IRETD.IRETD_0, IRETQ.IRETQ_0),
    208 -> Set(ROR.ROR_1, SHL.SHL_1, SAR.SAR_1, SHR.SHR_1, RCL.RCL_1, SAL.SAL_1, ROL.ROL_1, RCR.RCR_1),
    209 -> Set(SAR.SAR_2, RCR.RCR_4, ROL.ROL_2, SAR.SAR_6, SHL.SHL_4, ROL.ROL_6, RCR.RCR_2, SHL.SHL_6, ROR.ROR_4, RCL.RCL_4, SAL.SAL_2, SAL.SAL_6, SAR.SAR_4, SHL.SHL_2, SHR.SHR_2, ROL.ROL_4, SHR.SHR_6, ROR.ROR_6, SHR.SHR_4, RCL.RCL_6, ROR.ROR_2, RCL.RCL_2, RCR.RCR_6, SAL.SAL_4),
    212 -> Set(AAM.AAM_0, AMX.AMX_0),
    213 -> Set(ADX.ADX_0, AAD.AAD_0),
    214 -> Set(SALC.SALC_0, SETALC.SETALC_0),
    215 -> Set(XLATB.XLATB_0, XLAT.XLAT_0),
    216 -> Set(FCOMP.FCOMP_1, FSUB.FSUB_0, FDIV.FDIV_0, FCOMP.FCOMP_0, FCOM.FCOM_0, FDIVR.FDIVR_0, FMUL.FMUL_0, FCOM.FCOM_1, FSUBR.FSUBR_0, FADD.FADD_0),
    217 -> Set(FNSTCW.FNSTCW_0, FDECSTP.FDECSTP_0, FSTP.FSTP_0, FLDLN2.FLDLN2_0, FSQRT.FSQRT_0, FSIN.FSIN_0, FTST.FTST_0, FSINCOS.FSINCOS_0, FNOP.FNOP_0, FSCALE.FSCALE_0, FYL2XP1.FYL2XP1_0, FABS.FABS_0, FXAM.FXAM_0, FXTRACT.FXTRACT_0, FSTCW.FSTCW_0, FLDLG2.FLDLG2_0, FCOS.FCOS_0, FLD1.FLD1_0, FST.FST_0, FINCSTP.FINCSTP_0, FRNDINT.FRNDINT_0, FXCH.FXCH_0, FLDL2E.FLDL2E_0, FLD.FLD_0, F2XM1.F2XM1_0, FPTAN.FPTAN_0, FLDPI.FLDPI_0, FYL2X.FYL2X_0, FPREM1.FPREM1_0, FLDCW.FLDCW_0, FLDL2T.FLDL2T_0, FLDZ.FLDZ_0, FCHS.FCHS_0, FPATAN.FPATAN_0, FPREM.FPREM_0),
    218 -> Set(FISUBR.FISUBR_0, FIDIV.FIDIV_0, FICOMP.FICOMP_0, FIDIVR.FIDIVR_0, FISUB.FISUB_0, FUCOMPP.FUCOMPP_0, FICOM.FICOM_0, FIMUL.FIMUL_0, FIADD.FIADD_0),
    219 -> Set(FENI.FENI_0, FNDISI.FNDISI_0, FNENI.FNENI_0, FCLEX.FCLEX_0, FNINIT.FNINIT_0, FDISI.FDISI_0, FISTTP.FISTTP_0, FIST.FIST_0, FNCLEX.FNCLEX_0, FISTP.FISTP_0, FILD.FILD_0, FNSETPM.FNSETPM_0, FSETPM.FSETPM_0, FINIT.FINIT_0),
    220 -> Set(FCOM.FCOM_2, FDIV.FDIV_1, FDIVR.FDIVR_1, FSUB.FSUB_1, FSUBR.FSUBR_1, FADD.FADD_1, FMUL.FMUL_1, FCOMP.FCOMP_2),
    221 -> Set(FUCOMP.FUCOMP_0, FUCOM.FUCOM_0, FNSTSW.FNSTSW_0, FSTP.FSTP_1, FST.FST_1, FLD.FLD_1, FSTSW.FSTSW_0),
    222 -> Set(FIMUL.FIMUL_1, FIDIV.FIDIV_1, FIDIVR.FIDIVR_1, FDIVP.FDIVP_0, FCOMPP.FCOMPP_0, FISUBR.FISUBR_1, FICOM.FICOM_1, FIADD.FIADD_1, FADDP.FADDP_0, FSUBRP.FSUBRP_0, FSUBP.FSUBP_0, FISUB.FISUB_1, FMULP.FMULP_0, FICOMP.FICOMP_1, FDIVRP.FDIVRP_0),
    223 -> Set(FSTSW.FSTSW_1, FNSTSW.FNSTSW_1, FILD.FILD_1, FIST.FIST_1, FISTTP.FISTTP_1, FISTP.FISTP_1),
    224 -> Set(LOOPNZ.LOOPNZ_0, LOOPNE.LOOPNE_0),
    225 -> Set(LOOPE.LOOPE_0, LOOPZ.LOOPZ_0),
    226 -> Set(LOOP.LOOP_0),
    227 -> Set(JCXZ.JCXZ_0, JECXZ.JECXZ_0, JRCXZ.JRCXZ_0),
    228 -> Set(IN.IN_0),
    230 -> Set(OUT.OUT_0),
    232 -> Set(CALL.CALL_3, CALL.CALL_4),
    233 -> Set(JMP.JMP_5, JMP.JMP_4),
    235 -> Set(JMP.JMP_2),
    236 -> Set(IN.IN_1),
    238 -> Set(OUT.OUT_1),
    241 -> Set(INT1.INT1_0, ICEBP.ICEBP_0),
    244 -> Set(HLT.HLT_0),
    245 -> Set(CMC.CMC_0),
    246 -> Set(DIV.DIV_0, TEST.TEST_4, IMUL.IMUL_0, IDIV.IDIV_0, NOT.NOT_0, NEG.NEG_0, MUL.MUL_0),
    247 -> Set(TEST.TEST_9, IDIV.IDIV_2, NEG.NEG_3, IMUL.IMUL_5, NOT.NOT_1, MUL.MUL_1, MUL.MUL_2, IDIV.IDIV_3, TEST.TEST_3, DIV.DIV_3, NEG.NEG_2, NOT.NOT_3, DIV.DIV_2, IMUL.IMUL_3, MUL.MUL_3, NEG.NEG_1, IDIV.IDIV_1, DIV.DIV_1, NOT.NOT_2, TEST.TEST_0, IMUL.IMUL_1),
    248 -> Set(CLC.CLC_0),
    249 -> Set(STC.STC_0),
    250 -> Set(CLI.CLI_0),
    251 -> Set(STI.STI_0),
    252 -> Set(CLD.CLD_0),
    253 -> Set(STD.STD_0),
    254 -> Set(DEC.DEC_0, INC.INC_0),
    255 -> Set(PUSH.PUSH_8, DEC.DEC_5, JMP.JMP_3, INC.INC_5, INC.INC_1, PUSH.PUSH_4, JMP.JMP_0, DEC.DEC_1, INC.INC_2, CALL.CALL_2, JMP.JMP_1, PUSH.PUSH_1, CALL.CALL_1, DEC.DEC_2, CALL.CALL_0))
}
