package com.scalaAsm.x86
package Instructions

import com.scalaAsm.x86.Instructions._
import com.scalaAsm.x86.Instructions.General._
import com.scalaAsm.x86.Instructions.x87._
import com.scalaAsm.x86.Instructions.System._

 object Catalog {
    trait Standard {
      object callNear extends OneOperand[CALL.type]
      object add extends TwoOperands[ADD.type]
      object or extends TwoOperands[OR.type]
      object sub extends TwoOperands[SUB.type]
      object mul extends OneOperand[MUL.type]
      object imul extends OneOperand[IMUL.type]
      object cmp extends TwoOperands[CMP.type]
      
      object push extends OneOperand[PUSH.type]
      object pushf extends ZeroOperands[PUSHF.type]
      object pop extends OneOperand[POP.type]
      object dec extends OneOperand[DEC.type]
      object not extends OneOperand[NOT.type]
      object jmp extends OneOperand[JMP.type]
      object jnz extends OneOperand[JNZ.type]
      object jz extends OneOperand[JZ.type]
      object jl extends OneOperand[JL.type]
      object je extends OneOperand[JE.type]
      object int extends OneOperand[INT.type]
      //object rdrand extends OneOperand[RDRAND]
      object and extends TwoOperands[AND.type]
      object lea extends TwoOperands[LEA.type]
      object mov extends TwoOperands[MOV.type]
      object shr extends TwoOperands[SHR.type]
      object shl extends TwoOperands[SHL.type] with OneOperand[SHL.type]
      object sbb extends TwoOperands[SBB.type]
      object test extends TwoOperands[TEST.type]
      object xor extends TwoOperands[XOR.type]
      
      object retn extends ZeroOperands[RETN.type] with OneOperand[RETN.type]
      object leave extends ZeroOperands[LEAVE.type]
      
      
      object fld extends OneOperand[FLD.type]
      object fadd extends ZeroOperands[FADD.type]
      object fstp extends OneOperand[FSTP.type]
      
      object rdtsc extends ZeroOperands[RDTSC.type]
      object rdtscp extends ZeroOperands[RDTSCP.type]
      object cpuid extends ZeroOperands[CPUID.type]
    }
  }