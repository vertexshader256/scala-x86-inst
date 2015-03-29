package com.scalaAsm.x86
package Instructions

import com.scalaAsm.x86.Instructions._
import com.scalaAsm.x86.Instructions.General._
import com.scalaAsm.x86.Instructions.x87._
import com.scalaAsm.x86.Instructions.System._
import com.scalaAsm.x86.Instructions.General.POP

 object Catalog {
    trait Standard {
      
      object callNear extends OneOperand[CALL]
      object add extends TwoOperands[ADD]
      object or extends TwoOperands[OR]
      object sub extends TwoOperands[SUB]
      object mul extends OneOperand[MUL]
      object imul extends OneOperand[IMUL]
      object cmp extends TwoOperands[CMP]
      
      object push extends OneOperand[PUSH]
      object pushf extends ZeroOperands[PUSHF]
      object pop extends OneOperand[POP]
      object dec extends OneOperand[DEC]
      object not extends OneOperand[NOT]
      object jmp extends OneOperand[JMP]
      object jnz extends OneOperand[JNZ]
      object jz extends OneOperand[JZ]
      object jl extends OneOperand[JL]
      object je extends OneOperand[JE]
      object int extends OneOperand[INT]
      //object rdrand extends OneOperand[RDRAND]
      object and extends TwoOperands[AND]
      object lea extends TwoOperands[LEA]
      object mov extends TwoOperands[MOV]
      object shr extends TwoOperands[SHR]
      object shl extends TwoOperands[SHL] with OneOperand[SHL]
      object sbb extends TwoOperands[SBB]
      object test extends TwoOperands[TEST]
      object xor extends TwoOperands[XOR]
      
      object retn extends ZeroOperands[RETN] with OneOperand[RETN]
      object leave extends ZeroOperands[LEAVE]
      
      
      object fld extends OneOperand[FLD]
      object fadd extends ZeroOperands[FADD]
      object fstp extends OneOperand[FSTP]
      
      object rdtsc extends ZeroOperands[RDTSC]
      object rdtscp extends ZeroOperands[RDTSCP]
      object cpuid extends ZeroOperands[CPUID]
    }
  }