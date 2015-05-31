package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not below or equal/above (CF=0 AND ZF=0)
// Category: general/datamov

trait CMOVNBE extends InstructionDefinition {
  val mnemonic = "CMOVNBE"
}

object CMOVNBE extends TwoOperands[CMOVNBE] with CMOVNBEImpl

trait CMOVNBEImpl extends CMOVNBE {
  implicit object CMOVNBE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNBE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNBE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x47) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }
}
