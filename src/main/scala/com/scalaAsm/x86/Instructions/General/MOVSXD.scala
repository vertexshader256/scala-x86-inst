package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Move with Sign-Extension
// Category: general/conver

object MOVSXD extends InstructionDefinition("MOVSXD") with MOVSXDImpl

trait MOVSXDLow {
  implicit object MOVSXD_0 extends MOVSXD._2[r64, rm32] {
    val opcode: OneOpcode = 0x63 /r
  }
}

trait MOVSXDImpl extends MOVSXDLow {
  implicit object MOVSXD_1 extends MOVSXD._2[r32, rm32] {
    val opcode: OneOpcode = 0x63 /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = None))
      } else None
    }
  }
}
